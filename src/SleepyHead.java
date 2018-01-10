
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		int yes = JOptionPane.showConfirmDialog(null, "is it a weekday?", "hi", JOptionPane.YES_NO_OPTION);
		int vac = JOptionPane.showConfirmDialog(null, "are you on vacation?", "hi", JOptionPane.YES_NO_OPTION);
		if (yes == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		if (yes == JOptionPane.YES_OPTION) {
		if (vac == JOptionPane.YES_OPTION) {	
			JOptionPane.showMessageDialog(null, "sleep in");
		}else
		JOptionPane.showMessageDialog(null, "get up lazy bones");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
