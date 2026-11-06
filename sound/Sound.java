// import the next 3 files so that you can play sound
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sound extends JPanel implements ActionListener{

    // Declare a button
    JButton sButton;

    // If the user pushes a button, play the sound
    public Sound() {
        // Set up the button
        sButton = new JButton("Play Sound");
        setLayout(null);

        sButton.setBounds(400, 300, 100, 30);
        add(sButton);

        // Listen for the button press
        sButton.addActionListener(this);
    }

    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g) {
        
    }

    // Use this code as is. You can find free .wav files at wavsource.com.
    public void playSound() {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("ominous.wav").getAbsoluteFile()));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public void actionPerformed(ActionEvent event) {
			
		// Check to see if the button was pushed
		if (event.getSource()== sButton) {
			playSound();
		}

        // Since this code is not drawing on the JPanel, I did not include a call to repaint
		
	}
}
