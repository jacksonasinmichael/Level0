import javax.swing.JOptionPane;

public class riddlemethis {

	public static void main(String[] args) {

int score= 1;
String correct=JOptionPane.showInputDialog("Who's white, tall, and sucks at life?");
if(correct.equals("Jackson"))
		{
JOptionPane.showMessageDialog(null,("It's sad isn't it"));
score= +1;
JOptionPane.showMessageDialog(null, score);
	
		}
else
{
	JOptionPane.showMessageDialog(null,("awe i wish"));
	score=-1;
	JOptionPane.showMessageDialog(null, score);

}

		JOptionPane.showMessageDialog(null, score);
	}
}

