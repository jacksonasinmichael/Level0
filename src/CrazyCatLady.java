import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
public static void main(String[] args) {
String catstring=JOptionPane.showInputDialog("How many cats do you have?");
int cats=Integer.parseInt(catstring);
if(cats>3){
JOptionPane.showMessageDialog(null, "yu has too many cats you weeb");
}
if(cats==0){
playVideo("https://www.youtube.com/watch?v=k85mRPqvMbE");
}
if(cats<3 && cats>0){
playVideo("https://www.youtube.com/watch?v=-ZOiX6cIT8o");
}
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

