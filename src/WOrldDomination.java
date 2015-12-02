import javax.swing.JOptionPane;

public class WOrldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String know=JOptionPane.showInputDialog("Do you know coode?");
		// 2. If they say "yes", tell them they will rule the world.
 if (know.equals("yes"))
 { JOptionPane.showMessageDialog(null, "Then you will rule the world.");
 
 }
		// 3. Otherwise, wish them good luck washing dishes.
 else 
 { JOptionPane.showMessageDialog(null, "Then good luck washing dishes.");
 
	}
	}
}
