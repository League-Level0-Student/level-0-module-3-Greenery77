
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		int x = (10);
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		rob.show();
	
		rob.setSpeed(100);
		
		rob.setX(x);
		
		rob.hide();
		
		// 2. Make the robot draw a star shape. Hint: angle=144.
		
		rob.penDown();
		
		for (int s = 0; s < 10; s++) {
			
		rob.setAngle(90);
			
		for (int i = 0; i < 5; i++) {
		
		rob.move(30);
		rob.turn(144);
		
		}
		
		rob.penUp();
		rob.setAngle(90);
		rob.move(50);
		rob.penDown();
		
		}
		
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
