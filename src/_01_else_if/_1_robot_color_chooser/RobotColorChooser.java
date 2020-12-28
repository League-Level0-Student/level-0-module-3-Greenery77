
package _01_else_if._1_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) throws InterruptedException {
		
		//1. Create a new Robot
		
	Robot rob = new Robot(); 
	rob.setSpeed(40);	
	
	    //2. Make the robot draw a shape (this will take more than one line of code)		
	
	
	
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
	
	for (int i = 0; i < 10; i++) {
	
	String penColor = JOptionPane.showInputDialog("What color do you want the robot to draw with?(Red, Green, Blue)");
	
		//5. Use an if/else statement to set the pen color that the user requested
	
	if(penColor.equalsIgnoreCase("Red") ) {
		
	rob.setPenColor(Color.red);
		
	}
	
	else if(penColor.equalsIgnoreCase("Green") ) {
		
		rob.setPenColor(Color.green);
			
		}
	
	else if(penColor.equalsIgnoreCase("Blue") ) {
		
		rob.setPenColor(Color.blue);
			
		}
	
        //6. If the user doesn't enter anything, choose a random color
	
	else {
		
	rob.setPenColor(Color.GRAY);
		
	}
	
	rob.penDown();
	rob.setPenWidth(10);
	
	for (int j = 0; j < 4; j++) {
		
	rob.move(100);	
	
	rob.turn(90);
	
	}
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	}
	}

