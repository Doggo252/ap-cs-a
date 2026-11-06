import javax.swing.JFrame;

public class Runner {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Sound Exanple");

        Sound sObj = new Sound();
        frame.add(sObj);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}