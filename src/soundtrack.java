
	import java.net.URI;

	import javax.swing.JOptionPane;

	public class soundtrack {

		public static void main(String[] args) {

			int userMood = JOptionPane.showOptionDialog(null, "How are you doing? :3", "Soundtrack2Lyfe", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Salty" }, null);
			
			System.out.println(userMood);
			// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if (userMood==2){
	playVideo("https://youtu.be/hLQl3WQQoQ0");
}
if (userMood==0){
	JOptionPane.showMessageDialog(null, "You freakin asked for it");
	playVideo("https://youtu.be/y6Sxv-sUYtM");
}
if (userMood==1){
	playVideo("https://youtu.be/0nmBLTXcyVM");
}
}
			// If you are seeing ads at the beginning of your videos, install Adblock.

		

		static void playVideo(String youTubeLink) {
			try {
				URI uri = new URI(youTubeLink);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	



	
	/**
	* If you can’t think of any, here are some you can use...
	*	bit.ly/video-for-happy
	*	bit.ly/video-for-sad
	*	bit.ly/video-for-angry
	**/


}
