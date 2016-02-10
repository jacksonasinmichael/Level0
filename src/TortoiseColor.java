
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;

	public class TortoiseColor {
		public static void main(String[] args) {
for (int i = 0; i < 3; i++) {
	

String color=JOptionPane.showInputDialog(null, "What color would you like the shape?");			
if (color.equals("blue"))
{
	Tortoise.setPenColor(Colors.Blues.Blue);
}
else if (color.equals("red"))
{
Tortoise.setPenColor(Colors.Reds.Red);
}
else if (color.equals("yellow"))
{
Tortoise.setPenColor(Colors.Yellows.Khaki);
}
else
{
	Tortoise.setPenColor(Colors.getRandomColor());
}
	
Tortoise.penDown();
Tortoise.setSpeed(10);
for (int j = 0; j < 3; j++) {
	

Tortoise.move(50);
Tortoise.turn(120);
}
}
		}
	}
	



