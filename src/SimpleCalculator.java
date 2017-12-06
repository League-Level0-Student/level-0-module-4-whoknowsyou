
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 10; i--) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String numa =JOptionPane.showInputDialog(null, "give me a number");
String numb =JOptionPane.showInputDialog(null, "give me another number");
double num1=Double.parseDouble(numa);
double num2=Double.parseDouble(numb);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "mytiply", "divide" },
				null);

		
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation==0) {
		add(num1, num2);	
		}else if (operation==1) {
			sub(num1, num2);	
		}else if (operation==3) {
			div(num1, num2);	
		}else if (operation==2) {
			mti(num1, num2);	
		}
		
		
		
		
		
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
}
	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
public static void add(double num1, double num2) {
	
double l = num1 + num2;
JOptionPane.showMessageDialog(null, l);	
}
	// 4. Create similar methods for subtraction, multiplication and division.
public static void sub(double num1, double num2) {

	double sub = num1 - num2;
	JOptionPane.showMessageDialog(null, sub);	



}
	public static void div(double num1, double num2) {

		double div = num1 / num2;
		JOptionPane.showMessageDialog(null, div);	

	}

		public static void mti(double num1, double num2) {
			double mil = num1 * num2;
			JOptionPane.showMessageDialog(null, mil);	
}
}		
		
		
		
		
		
		
		