import javax.swing.JOptionPane;

public class Remarkable {public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Whats your name person.");
	if(name.equalsIgnoreCase("Callum")) {
		JOptionPane.showMessageDialog(null, "You have the best inspirational quotes.");
	}
	else if(name.equalsIgnoreCase("Lauren")) { JOptionPane.showMessageDialog(null, "You are an amazing person conratulations!");}
	else if(name.equalsIgnoreCase("Victor")) { JOptionPane.showMessageDialog(null, "Spicy Glasses!!");}
	else if(name.equalsIgnoreCase("Yasir")) { JOptionPane.showMessageDialog(null, "You are an amzing programmer!");}
	else if(name.equalsIgnoreCase("Emil")) { JOptionPane.showMessageDialog(null, "You are the programmer of this amazing but simple program!");}
	else if(name.equalsIgnoreCase("Max")) { JOptionPane.showMessageDialog(null, "You are really productive!");}
	else if(name.equalsIgnoreCase("Cruz")) { JOptionPane.showMessageDialog(null, "YOU ARE REMARKABLE!");}
}
}