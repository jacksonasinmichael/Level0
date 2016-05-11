
	import java.util.Random;

	import javax.swing.JOptionPane;

	public class Validation {
		public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt(5);
			System.out.println(num);		
			if(num==0){
			JOptionPane.showMessageDialog(null, "U da best");
			}
			if(num==1){
				JOptionPane.showMessageDialog(null, "You're not that meaningless");
				}
			if(num==2){
				JOptionPane.showMessageDialog(null, "Your cheekbones tho");
				}
			if(num==3){
				JOptionPane.showMessageDialog(null, "what nice earlobes you have!");
				}
			if(num==4){
				JOptionPane.showMessageDialog(null, "What beautiful nostrils fren :]");
				}

			}


		}
	}


