
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFArm {

	AnimalFArm() {
		for (int i = 0; i < 3; i++) {
			
		}
		String animal= JOptionPane.showInputDialog("which animal do you want: oscar, pelliper, or me?");
		if(animal.equals("oscar"))
		for (int i = 0; i < 200; i++) {
			playMoo();
		}
		 if(animal.equals("pelliper"))
		 for (int i = 0; i < 200; i++) {
			
		playQuack();
		 }
		 
		 if(animal.equals("llama"))
			for (int i = 0; i < 1000; i++) {
				
		playLlama();
			
			}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";
	
	

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(50);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFArm();
	}

}

