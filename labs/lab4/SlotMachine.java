import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;  

public class SlotMachine {
       //instance variables
       Font fontPayout;
       Color blue, yellow;

      //constructor
      public SlotMachine() {
        //example: initialize/instantiate instance variables
        fontPayout = new Font("Arial", Font.BOLD, 20); //20 is font size. 
        blue = new Color(0, 0, 255);
        yellow = new Color(255, 255, 0);

      }

      //example: draw a payout table. 
      private void drawPayout(Graphics g){
          g.setColor(yellow);
          g.fillRect(30, 25, 225, 60);
          g.setFont(fontPayout);
          g.setColor(blue);
          g.drawString("7 7 7 = 100 points", 40, 40); 
          g.drawString("3 of a kind = 5 points", 40, 60); 
          g.drawString("2 of a kind = 2 points", 40, 80); 

      } 

      /* draw the machine (this can be just a box or you can import an image) with the 3 numbers, current balance, 
         and calls drawPayOut() */
      public void drawMachine(Graphics g) {
          // Draw the machine


          drawPayout(g);
      } 

      /* generate 3 new random numbers for num1, num2 and num3.  Calculate the winnings.  Updates the balance and 
         winnings. */
      public void play(){
      }  


      // return true if balance > 0. Return false otherwise.
      public boolean keepPlaying() {
        return true;
      } 

}
