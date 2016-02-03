
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {
		

    int fortune=new Random().nextInt(4);
	JOptionPane.showMessageDialog(null, fortune);
JOptionPane.showInputDialog("Ask me a question about your future. *laughs maniacally*");
if(fortune==0)
{
	JOptionPane.showMessageDialog(null, "yyaaaaaaaas");
}
else if(fortune==1)
{
	JOptionPane.showMessageDialog(null, "never");
}
else if(fortune==2)
{
	JOptionPane.showMessageDialog(null, "possibry");
}
else if(fortune==3)
{
	JOptionPane.showMessageDialog(null, "go die");

}
}
}		


