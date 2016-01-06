import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Flag {
public static void main(String[] args) {
	Tortoise.show();
	Tortoise Florence=new Tortoise();
	Florence.setX(250);
	Florence.setY(250);
	Florence.setPenWidth(50);
	Florence.setPenColor(PenColors.Greens.ForestGreen);
	Florence.turn(180);
	Florence.move(100);
	Florence.setX(300);
	Florence.setY(250);
	Florence.setPenColor(PenColors.Whites.AliceBlue);
	Florence.move(100);
	Florence.setX(350);
	Florence.setY(250);
	Florence.setPenColor(PenColors.Oranges.DarkOrange);
	Florence.move(100);
}
}
