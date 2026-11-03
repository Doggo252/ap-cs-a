import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {
	// instance variables
        

	// Initialization Constructor
	public Screen() {
             setFocusable(true);
             setLayout(null);

             // Set up KeyListening. requestFocusInWindow() directs focus to the current (this) JPanel
             this.requestFocusInWindow();
             this.addKeyListener(this);
	    
            // instantiate/initialize objects
            

	}

    //set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(800,600);
	}
	
    // Call the draw methods
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
        // Call the draw methods
       

	}

    @Override
    public void keyPressed(KeyEvent e) {
        // Triggers spin when spacebar is pressed
        if (e.getKeyCode() == 32) {   // or whatever key you want to use for your spin key
            
            }
        }
    

    // Required KeyListener interface methods
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}