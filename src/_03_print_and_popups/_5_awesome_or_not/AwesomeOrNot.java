package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	
		    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	Random ran = new Random();
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	int Number = ran.nextInt(4);
		// 3. Print your variable to the console
System.out.println(Number);
		// 4. Get the user to enter something that they think is awesome
	String cool = JOptionPane.showInputDialog("What is awesome?");
		// 5. If your variable is  0
	if(Number==(0)) {JOptionPane.showMessageDialog(null, "Thats awesome!");}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (Number==(1)) {JOptionPane.showMessageDialog(null, "Ok.");}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (Number==(2)) {JOptionPane.showMessageDialog(null, "Thats boring.");}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if(Number==(3)) {JOptionPane.showMessageDialog(null, "That's cool but I'm not interested");}
			// -- invent your own message to give to the user (be nice).

}}
