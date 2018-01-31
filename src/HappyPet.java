//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happylevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog(null, "what do you want "
				+ " cat   dog   or   the dreaded bird");
				
				// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 10; i++) {
	

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "what do you want to do with your pet", "", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "food", "wash", "take a walk" }, null);
System.out.println(task);
		// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	food();
}else if (task==1) {
	clean();
}else if (task==2 ) {
	walk();
}
		
		
		
		
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if (happylevel>6) {
	JOptionPane.showMessageDialog(null, "your pet loves you");
break;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void food() {

		JOptionPane.showMessageDialog(null,"your pet is full");
happylevel=happylevel+2;
	}

	public static void clean() {
		JOptionPane.showMessageDialog(null,"your pet is clean");
		happylevel=happylevel+1;
		
	}

	public static void walk() {
		JOptionPane.showMessageDialog(null,"your pet is tired");
		happylevel=happylevel-1;
		
	}
}
