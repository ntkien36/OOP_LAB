package hust.soict.hedspi.lab01;

import javax.swing.JOptionPane;

public class ChoosingOption2 {
	public static void main(String[] args) {
		String[] options = new String[] {"Yes", "No"};
		
		int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Select an option",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
		
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+(option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}