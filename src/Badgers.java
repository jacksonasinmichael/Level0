
public class Badgers {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {

			for (int b = 0; b < 25; b++) {

				speak("kill me");
			}
			for (int b = 0; b < 1; b++) {
				speak("One less one less problem");
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
