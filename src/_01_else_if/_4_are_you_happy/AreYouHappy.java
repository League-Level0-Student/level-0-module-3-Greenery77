package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		
		String areYouHappy = JOptionPane.showInputDialog("Are you happy?");
		
		//
		
		if (areYouHappy.equalsIgnoreCase("Yes")){
			
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		
		}
		
		//
		
		else if (areYouHappy.equalsIgnoreCase("No")){
			
		String wantToBe = JOptionPane.showInputDialog("Do you want to be happy?");
		
		//
		
		if (wantToBe.equalsIgnoreCase("Yes")) {
			
		JOptionPane.showMessageDialog(null, "Then change something.");
			
		}
		
		//
		
		else if (wantToBe.equalsIgnoreCase("No")) {
			
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			
		}
		}
		
		//
		
		
		
		
		
		
		
		
	}
}
