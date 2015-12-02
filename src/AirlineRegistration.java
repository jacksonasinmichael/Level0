import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String Name=JOptionPane.showInputDialog("Enter your first name.");
		String Name2=JOptionPane.showInputDialog("Enter your last name");
		String Destination=JOptionPane.showInputDialog("Enter your destination");
		String Birthday=JOptionPane.showInputDialog("Enter your birthday. (for security purposes)");
		public void handleQuit()
		{
		  // display the showOptionDialog
		  int choice = JOptionPane.showOptionDialog(null, 
		      "Male", 
		      JOptionPane.INFORMATION_MESSAGE, 
		      JOptionPane.QUESTION_MESSAGE, 
		      null,
		      "Female", 
		      null, 
		      "Prefer not to say",
null);
		 
		  // interpret the user's choice
		  if (choice == JOptionPane.)
		  {
		    System.exit(0);
		  }
		}

	}
}




