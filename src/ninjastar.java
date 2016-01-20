
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class ninjastar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		Robot Florence= new Robot();
		Florence.penDown();
Florence.setX(700);	
Florence.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

Florence.setSpeed(10);
for (int i = 0; i < 12; i++) {
	
		Florence.turn(45);
		
		Florence.move(64);
			
		Florence.turn(-40);		
		Florence.setPenColor(Color.RED);
		Florence.move(flameSize);			
		Florence.turn(140);			
		Florence.move(flameSize);	
		Florence.setPenColor(Color.BLACK);
		Florence.turn(64);
		Florence.move(baseSize);	
}
	}

}



