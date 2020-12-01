package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
String yes = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if (yes.equals("yes")) {
JOptionPane.showMessageDialog(null, "You will rule the world!");}
		// 3. Otherwise, tell them to sign up for classes at The League.
else
{JOptionPane.showMessageDialog(null, "Then, sign up for classes at The League");}
	}}


