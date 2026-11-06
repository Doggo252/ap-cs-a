//graphics, font, color
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
//sound
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SlotMachine {
	// instance variables
	private int num1, num2, num3, displayNum1, displayNum2, displayNum3, winnings, balance;
	private Font fontPayout, fontPayout2, fontNumbers, fontEnd;
	private Color yellow, green, gold, text, red;

	// constructor
	public SlotMachine(int balance) {
		fontPayout = new Font("Arial", Font.BOLD, 20); //font for payout table
		fontPayout2 = new Font("Arial", Font.BOLD, 15); //font for payout while spinning
		fontNumbers = new Font("Arial", Font.BOLD, 80); //font for casino numbers
		fontEnd = new Font("Arial", Font.BOLD, 25); //font for when you run out of balance
		green = new Color(0, 100, 60);
		gold = new Color(255, 200, 40);
		text = new Color(40, 20, 0);
		red = new Color(220, 20, 30);
		yellow = new Color(255, 230, 0);
		this.balance = balance;
		winnings = 0;
		num1 = 0;
		num2 = 0;
		num3 = 0;
		displayNum1 = 0;
		displayNum2 = 0;
		displayNum3 = 0;
	}


	//draw the payout table.
	private void drawPayOut(Graphics g) {
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

	//draw the machine
	public void drawMachine(Graphics g, boolean spinning) {
		//draw the background
		g.setColor(green);
		g.fillRect(0, 0, 800, 600);

		//draw the current balance and winnings
		g.setColor(gold);
		g.fillRoundRect(675, 25, 100, 125, 30, 30);
		g.setFont(fontPayout);
		g.setColor(text);
		g.drawString("Balance", 685, 50);
		g.fillRect(685, 53, 80, 2);
		g.drawString("Winnings", 685, 110);
		g.fillRect(685, 113, 85, 2);
		if (spinning){ //check if spinning to not spoil the result
			g.setFont(fontPayout2);
			g.drawString("Spinning...", 685, 80);
			g.setFont(fontPayout);
			g.drawString("...", 685, 140);
		}
		else {
			g.drawString("" + this.balance, 685, 80);
			g.drawString("" + this.winnings, 685, 140);
		}
		

		//draw the three casino number boxes
		g.setColor(red);
		g.fillRoundRect(200, 300, 100, 100, 20, 20);
		g.fillRoundRect(350, 300, 100, 100, 20, 20);
		g.fillRoundRect(500, 300, 100, 100, 20, 20);

		//draw the numbers
		g.setFont(fontNumbers);
		g.setColor(text);
		g.drawString("" + displayNum1, 227, 377);
		g.drawString("" + displayNum2, 377, 377);
		g.drawString("" + displayNum3, 527, 377);
		
		//draw payout table
		drawPayOut(g);

		//check for balance depleted to draw that
		if (!keepPlaying() && !spinning){
			balanceDepleted(g);
		}

		//draw spacebar instruction
		g.setFont(fontPayout);
		g.setColor(yellow);
		g.drawString("Press the spacebar to play", 275, 250);
	}

	//play logic
	public void play() {
		//generate numbers
    	num1 = (int)(Math.random()*9)+1;
		num2 = (int)(Math.random()*9)+1;
		num3 = (int)(Math.random()*9)+1;
		//roll logic
		if (keepPlaying()){
			if ((num1 == num2) && (num2 == num3) && (num1 == 7)){
				winnings = 100;
				balance += 99;
			}
			else if ((num1 == num2) && (num2 == num3)){
				winnings = 5;
				balance += 4;
			}
			else if ((num1 == num2) || (num2 == num3) || (num1 == num3)){
				winnings = 2;
				balance += 1;
			}
			else{
				balance -= 1;
				winnings = 0;
			}
		}
	}

	//rolling animation
	public void animate(int stage){
		if (stage == 1){
			displayNum1 = (int)(Math.random()*9)+1;
			displayNum2 = (int)(Math.random()*9)+1;
			displayNum3 = (int)(Math.random()*9)+1;
		}
		else if (stage == 2){
      		displayNum1 = num1;
			displayNum2 = (int)(Math.random()*9)+1;
			displayNum3 = (int)(Math.random()*9)+1;
		}
		else if (stage == 3){
			displayNum1 = num1;
			displayNum2 = num2;
			displayNum3 = (int)(Math.random()*9)+1;
		}
		else if (stage == 4){
			displayNum1 = num1;
			displayNum2 = num2;
			displayNum3 = num3;

			//sound for win/lose
			if (winnings == 100){
				playJackpotSound();
			}
			else if (winnings > 0){
				playWinSound();
			}
			else{
				playLoseSound();
			}
		}
	}

	//checking if player has enough balance
	public boolean keepPlaying() {
		if (balance > 0){
			return true;
		}
		else {
			return false;
		}
	}

	//balance depleted funny message
	private void balanceDepleted(Graphics g){
		g.setColor(red);
		g.fillRoundRect(200, 300, 400, 100, 20, 20);
		g.setFont(fontEnd);
		g.setColor(text);
		g.drawString("I have gobbled all your money...", 213, 360);
		g.drawString("Buy more balance -- 100 credits for $4.99", 163, 460);
		g.drawString("Press [enter] to open webpage", 213, 510);
	}

	//all sound methods for winning/losing
	private void playJackpotSound() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("slotjackpot.wav").getAbsoluteFile()));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

	private void playWinSound() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("slotwin.wav").getAbsoluteFile()));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

	private void playLoseSound() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("slotlose.wav").getAbsoluteFile()));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

}
