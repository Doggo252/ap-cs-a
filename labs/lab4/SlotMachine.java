import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class SlotMachine {
	// instance variables
	private int num1, num2, num3, winnings, balance;
	private Font fontPayout, fontNumbers, fontEnd;
	private Color blue, yellow, green, gold, text, red;

	// constructor
	public SlotMachine(int balance) {
		fontPayout = new Font("Arial", Font.BOLD, 20); // 20 is font size.
		fontNumbers = new Font("Arial", Font.BOLD, 80); // 80 is font size.
		fontEnd = new Font("Arial", Font.BOLD, 25); // 40 is font size.
		blue = new Color(0, 0, 255);
		yellow = new Color(255, 255, 0);
		green = new Color(0, 100, 60);
		gold = new Color(255, 200, 40);
		text = new Color(40, 20, 0);
		red = new Color(220, 20, 30);
		this.balance = balance;
		winnings = 0;
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}


	// example: draw a payout table.
	private void drawPayout(Graphics g) {
		g.setColor(gold);
		g.fillRoundRect(30, 25, 345, 105, 30, 30);
		g.setFont(fontPayout);
		g.setColor(text);
		g.drawString("Payout Table", 40, 50);
		g.drawString("Three sevens (7, 7, 7) = 100 points", 40, 80);
		g.drawString("3 of a kind = 5 points", 40, 100);
		g.drawString("2 of a kind = 2 points", 40, 120);
		g.fillRect(40, 53, 130, 2);
	}

	/*
	 * draw the machine (this can be just a box or you can import an image) with the
	 * 3 numbers, current balance,
	 * and calls drawPayOut()
	 */
	public void drawMachine(Graphics g) {
		//draw the background
		g.setColor(green);
		g.fillRect(0, 0, 800, 600);

		//draw the current balance
		g.setColor(gold);
		g.fillRoundRect(675, 25, 100, 125, 30, 30);
		g.setFont(fontPayout);
		g.setColor(text);
		g.drawString("Balance", 685, 50);
		g.fillRect(685, 53, 80, 2);
		g.drawString("Winnings", 685, 110);
		g.fillRect(685, 113, 85, 2);
		g.drawString("" + this.balance, 685, 80);
		g.drawString("" + this.winnings, 685, 140);

		//draw the three numbers
		g.setColor(red);
		g.fillRoundRect(200, 300, 100, 100, 20, 20);
		g.fillRoundRect(350, 300, 100, 100, 20, 20);
		g.fillRoundRect(500, 300, 100, 100, 20, 20);

		//numbers
		g.setFont(fontNumbers);
		g.setColor(text);
		g.drawString("" + num1, 227, 377);
		g.drawString("" + num2, 377, 377);
		g.drawString("" + num3, 527, 377);
		
		//draw payout table
		drawPayout(g);

		if (!keepPlaying()){
			balanceDepleted(g);
		}
	}

	/*
	 * generate 3 new random numbers for num1, num2 and num3. Calculate the
	 * winnings. Updates the balance and
	 * winnings.
	 */
	public void play() {
		//roll logic
		if (keepPlaying()){
			if ((num1 == num2) && (num2 == num3) && (num1 == 7)){
				winnings += 100;
				balance += 99;
			}
			else if ((num1 == num2) && (num2 == num3)){
				winnings += 5;
				balance += 4;
			}
			else if ((num1 == num2) || (num2 == num3) || (num1 == num3)){
				winnings += 2;
				balance += 1;
			}
			else{
				balance -= 1;
				winnings -= 1;
			}
		}
	}

	public void animate(int stage){
		if (stage == 1){
			num1 = (int)(Math.random()*9)+1;
			num2 = (int)(Math.random()*9)+1;
			num3 = (int)(Math.random()*9)+1;
		}
		else if (stage == 2){
			num2 = (int)(Math.random()*9)+1;
			num3 = (int)(Math.random()*9)+1;
		}
		else if (stage == 3){
			num3 = (int)(Math.random()*9)+1;
		}
	}

	// return true if balance > 0. Return false otherwise.
	public boolean keepPlaying() {
		if (balance > 0){
			return true;
		}
		else {
			return false;
		}
	}

	private void balanceDepleted(Graphics g){
		g.setColor(red);
		g.fillRoundRect(200, 300, 400, 100, 20, 20);
		g.setFont(fontEnd);
		g.setColor(text);
		g.drawString("You don't have enough balance.", 213, 360);
	}
}
