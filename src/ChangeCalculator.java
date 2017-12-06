//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick=JOptionPane.showInputDialog(null,"how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int nickal=Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dime=JOptionPane.showInputDialog(null,"how many dimes do you have");
int dimes=Integer.parseInt(dime);		
		// Ask the user how many quarters they have, and convert their answer
String quart=JOptionPane.showInputDialog(null,"how many quarters do you have");
int quarters=Integer.parseInt(quart);		
		// Calculate how much money the user has and save it in a double variable 
double n=nickal*0.05;

double d=dimes*0.1;

double q=quarters*0.25;

double todal= n+d+q;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "you have $"+todal);
	}
}

