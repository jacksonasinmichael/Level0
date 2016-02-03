import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String bday= JOptionPane.showInputDialog("When's your birthday fren?");
	if(bday.equals("02/03"))
	{
		JOptionPane.showMessageDialog(null, "Happi birfday fren!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Merri Unbirfday fren!");
	}
}
}
