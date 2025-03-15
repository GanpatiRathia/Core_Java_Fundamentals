package _02_Operators;
import static java.lang.Math.*;

/**
 * 
 * Advance Calculator
 * Arithmetic Operators and Mathematical Functions and Constants
 * 
 */

public class _01_AdvanceCalculator {
	public static void main(String[] args) {
		double num1=45.6,num2 = 23.5;
		System.out.println("Value of num1 : " + num1 + ", num2 :" + num2);
		double sum = num1 + num2;  // Perform addition
		double sub = num1 - num2;  // Perform subtraction
		double mul = num1 * num2;  // Perform multiplication
		double div = num1 / num2;  // Perform division
        System.out.println("Arithmetic Operator \nSum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        
        System.out.println("Math Module :");
        
        double x = 4; 
        double y = Math.sqrt(x); 
        System.out.println("Square Root of " + x + " is " + y); // 2.0
        
        System.out.println(Math.pow(4, 2));
        
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(Math.PI/2));
        System.out.println(Math.tan(Math.PI/2));
        System.out.println(Math.atan(Math.PI/2));
        System.out.println(Math.exp(0)); 
        System.out.println(Math.log(100)); 
        System.out.println(Math.log10(100));
        
        //Can directly use without Math. after using import static java.lang.Math.*;
        System.out.println(PI);
        System.out.println(E);
        System.out.println(sin(PI/2));
        System.out.println(cos(PI/2));
        System.out.println(tan(PI/2));
        System.out.println(atan(PI/2));
        System.out.println(exp(0)); 
        System.out.println(log(100)); 
        System.out.println(log10(100));        

	}
}
