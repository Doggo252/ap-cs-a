//graphics
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

//key listening
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {
    // instance variables
    SlotMachine slotMachineObj;
    boolean spinning;
    long endTime1, endTime2, endTime3;

    // initialization constructor
    public Screen() {
        setFocusable(true);
        setLayout(null);

        // sets up keyListening, makes sure the window is focused
        this.requestFocusInWindow();
        this.addKeyListener(this);

        // instantiate/initialize object/variable
        slotMachineObj = new SlotMachine(100);
        spinning = false;
    }

    // set the size of the JPanel container
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    // draw the actual stuff
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        slotMachineObj.drawMachine(g, spinning);
    }

    // do things when keys are pressed
    @Override
    public void keyPressed(KeyEvent e) {
        // run the slot machine
        if (e.getKeyCode() == 32) { // space bar
            if (!spinning && slotMachineObj.keepPlaying()) {
                slotMachineObj.play();
                // animation for rolls
                long startTime = System.currentTimeMillis();
                endTime1 = startTime + 300;
                endTime2 = startTime + 600;
                endTime3 = startTime + 1080;
                spinning = true;
            }

        }
    }

    // rolling animation
    public void animate() {
        while (true) {
            if (spinning) {
                if (System.currentTimeMillis() < endTime1) {
                    slotMachineObj.animate(1);
                } else if (System.currentTimeMillis() < endTime2) {
                    slotMachineObj.animate(2);
                } else if (System.currentTimeMillis() < endTime3) {
                    slotMachineObj.animate(3);
                } else {
                    slotMachineObj.animate(4);
                    spinning = false;
                }
            }

            repaint();
            try {
                Thread.sleep(5);
            } catch (Exception exc) {
                exc.printStackTrace(System.out);
            }
        }
    }

    // required keyListener interface methods
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}