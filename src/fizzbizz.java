
public class fizzbizz {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 15 == 0) {
				System.out.println("fizzbuzz");
				speak("fizzbuzz");

			} else if (i % 3 == 0) {

				System.out.println("fizz");
				speak("fizz");

			} else if (i % 5 == 0) {
				System.out.println("buzz");
				speak("buzz");

			} else {
				System.out.println(i);
				speak(""+i);
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
