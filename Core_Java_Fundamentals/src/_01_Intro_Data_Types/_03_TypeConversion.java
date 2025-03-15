package _01_Intro_Data_Types;

//Java Program Demonstrating All Data Types (With Person Class in the Same File)

public class _03_TypeConversion {
	public static void main(String[] args) {
		
		 int n = 123456789; 
		 float f = n; // f is 1.23456792E
		 
		 System.out.println("n : " + n + " f : " + f);
		 
		 double x = 9.997; 
		 int nx = (int) x;
		 
		 System.out.println(nx);
		 
		 x = 9.997; 
		 nx = (int) Math.round(x);
		 System.out.println(nx);
		 
		 /*
		  * When two values are combined with a binary operator (such as n + f where n is an integer and f is a 
		  * floating-point value), both operands are converted to a common type before the operation is carried out.  
		  *	• If either of the operands is of type double, the other one will be converted to a double. 
		  *	• Otherwise, if either of the operands is of type float, the other one will be converted to a float.
		  *	• Otherwise, if either of the operands is of type long, the other one will be converted to a long.
		  *	• Otherwise, both operands will be converted to an int.
 		  *
		  */

	}
}
