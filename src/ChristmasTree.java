import java.awt.Color;
import java.util.Iterator;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ChristmasTree {

	public static void main(String[] args) {
		ChristmasTree Florence = new ChristmasTree();
		Florence.drawStar();
		Florence.drawTreeBody();
		Florence.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1;	//This is how much the width of the tree increases with each layer down

	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green	
		Tortoise.setPenColor(Color.GREEN);
			int turnAmount=175;
			Tortoise.setSpeed(10);
		// 2. Start the Tortoise facing to the right
			Tortoise.turn(90);
		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i < 11; i++) {
			
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(turnAmount);
			// 6. Set the treeWidth to  the current treeWidth times the scale
			treeWidth=treeWidth*scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(-turnAmount);
			// 10. Set the treeWidth to the current treeWidth times the scale again
			treeWidth=treeWidth*scale;
			// 11. Decrease turnAmount by 1
			turnAmount=turnAmount-1;
		}
}
	
	void drawTreeTrunk() {
			Tortoise.move(treeWidth/2);
			Tortoise.turn(90);
			Tortoise.setPenWidth(treeWidth/10);
			Tortoise.setPenColor(Color.DARK_GRAY);
			Tortoise.setSpeed(10);
			Tortoise.move(treeWidth/4);

	}
	
	void drawStar() {
		for (int i = 0; i < 5; i++) {
			Tortoise.setSpeed(10);
			Tortoise.setPenColor(Color.RED);
			Tortoise.move(25);
			Tortoise.turn(144);
		}
	
	}

}

