import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String Mom = "June 24th";
		String Dad = "September 20th";
		String Me = "August 7th";

		String bday = JOptionPane.showInputDialog("who's birthday do you want to know");
		JOptionPane.showMessageDialog(null, bday);
		if (bday.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "Moms birthday is " + Mom);
		} else if (bday.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "Dads birthday is " + Dad);
		}

		else if (bday.equals("Me")) {
			JOptionPane.showMessageDialog(null, "My birthday is " + Me);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	}
}
