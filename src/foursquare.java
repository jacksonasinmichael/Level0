
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class foursquare {
	
	Robot Florence=new Robot();	

	void go() {
		Florence.setSpeed(10);
		Florence.setPenWidth(5);
for (int i = 0; i < 4; i++) {
	

Florence.setRandomPenColor();	
		drawSquare();	
		Florence.turn(90);	
}
	}
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			
		Florence.penDown();
		Florence.turn(90);
		Florence.move(100);
		
		}
	}

	public static void main(String[] args) {
		new foursquare().go();
	}

}



