import java.util.Random;
import javax.swing.JOptionPane;

public class HighLow {public static void main(String[] args) {
		int random = new Random().nextInt(100);
System.out.println(random);	
for (int i = 0; i < 10; i++) {
int Ans=Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 1-100"));
		
if (Ans== random){
JOptionPane.showMessageDialog(null, "you're a weiner");	
i=10;
}
if (Ans>random){
	JOptionPane.showMessageDialog(null, "too high fren");	}
if (Ans<random){
	JOptionPane.showMessageDialog(null, "too low fren");	}
}
JOptionPane.showMessageDialog(null, "GG man :]");
}



}

