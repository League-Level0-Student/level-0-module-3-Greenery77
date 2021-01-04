package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "One day you see three ducklings swimming in a circle in the pond. \n"
	+ "They swim faster and faster until they all got dizzy and started swimming \n away from each other.");	
	
	String warnDuck = JOptionPane.showInputDialog("You spot what appears to be the mother duck nearby,\n"
	+ " she's busy cleaning her feathers. Do you tell her that \n her ducklings are drifting away?");
	
	//
	
	if (warnDuck.equalsIgnoreCase("Yes")){
		
	JOptionPane.showMessageDialog(null, "You shout at the mother duck which startles her into looking around. "
	+ "\n She notices her ducklings swimming away and herds them back together. \n The mother quacks in what you "
	+ "interpret to be a thankful way and you go home. \n \n The end :)");
	
	}
	
	//
	
	else if(warnDuck.equalsIgnoreCase("No")) {
		
	JOptionPane.showMessageDialog(null, "You shrug and turn around, heading home, believing that the issue would"
		+ "solve itself out... \n Later, whenever you visit the pond, there is but a single duck wondering "
		+ "where her kids \n were and what wouldve happened if she noticed them swimming away faster :,(");
		
	}
	
		
	}
		
		
		
		
		
		
		
		
		
}	

