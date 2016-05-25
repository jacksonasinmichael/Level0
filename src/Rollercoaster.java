import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String bigstring=JOptionPane.showInputDialog("How many big? (in foots)");
int big= Integer.parseInt(bigstring);
if(big>=4){
	JOptionPane.showMessageDialog(null, "U gud");
}
else if(big<4)
	JOptionPane.showMessageDialog(null, "U better grow fren");
}
}
