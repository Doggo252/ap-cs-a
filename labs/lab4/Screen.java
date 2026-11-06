import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {
	// instance variables
    SlotMachine sm;
    boolean spinning;
    long endTime1, endTime2, endTime3;

	// Initialization Constructor
	public Screen() {
             setFocusable(true);
             setLayout(null);

             // Set up KeyListening. requestFocusInWindow() directs focus to the current (this) JPanel
             this.requestFocusInWindow();
             this.addKeyListener(this);
	    
            // instantiate/initialize objects
            sm = new SlotMachine(100);
            spinning = false;
	}

    //set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
        sm.drawMachine(g);
        if (spinning){
            if (System.currentTimeMillis() < endTime1){
                sm.animate(1);
                repaint();
            }
            else if (System.currentTimeMillis() < endTime2){
                sm.animate(2);
                repaint();
            }
            else if (System.currentTimeMillis() < endTime3){
                sm.animate(3);
                repaint();
            }
            else{
                sm.play();
                repaint();
                spinning = false;
            }
        }
	}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            //animation for rolls
            long startTime = System.currentTimeMillis();
            endTime1 = startTime + 300;
            endTime2 = startTime + 1000;
            endTime3 = startTime + 1800;
            spinning = true;
            repaint();
        }
    }
    

    // Required KeyListener interface methods
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}