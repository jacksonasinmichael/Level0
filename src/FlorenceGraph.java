import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class FlorenceGraph {
	public static void main(String[] args) {
		Tortoise Florence = new Tortoise();
		Florence.setX(250);
		Florence.setY(250);
		Florence.setPenColor(PenColors.Purples.BlueViolet);
		Florence.setPenWidth(5);
		Florence.turn(90);
		Florence.move(100);
		Florence.setX(300);
		Florence.setY(250);
		Florence.turn(90);
		Florence.move(100);
		Florence.turn(90);
		Florence.move(50);
		Florence.turn(90);
		Florence.move(25); 
	}
}
