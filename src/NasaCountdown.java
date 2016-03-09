import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		string confirm = JOptionPane.showInputDialog("Would you like to start the countdown?");
		// 3. convert the user's answer to an int (Integer.parseInt)

		// 4. countdown from user's starting point
	for (int i = 10; i <100; i--) {
		speak(""+i);
		
	}

		// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }

}
