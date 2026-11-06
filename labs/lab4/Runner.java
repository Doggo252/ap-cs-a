import javax.swing.JFrame;

public class Runner { 
	public static void main(String args[]){
		//window name
		JFrame frame = new JFrame("Slot Machine");
		 
		//standard JPanel
		Screen sc = new Screen();
		frame.add(sc);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		//run the while true animation
		sc.animate();
		 
	}
}	