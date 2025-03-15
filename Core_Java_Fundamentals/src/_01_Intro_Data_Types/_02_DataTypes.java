package _01_Intro_Data_Types;

//Java Program Demonstrating All Data Types (With Person Class in the Same File)
/*

Summary of Data Types in Java
Type	Size					Example
byte	8-bit					byte x = 100;
short	16-bit					short y = 30000;
int	    32-bit					int z = 123456;
long	64-bit					long n = 9999999999L;
float	32-bit  (Decimal)		float pi = 3.14f;
double	64-bit  (Decimal)		double pi = 3.14159;
char	16-bit  Unicode			char c = 'A';
boolean	1-bit   (true/false)	boolean isJava = true;
String	N/A     (Object)		String msg = "Hello";
Array	Collection of elements	`int[] arr = {1,2,

final double PI = 3.14; //Constants
enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE }; 	// Enumeration Declaration
Size s = Size.MEDIUM;							 	// Enumeration Assign
*/

//Single Line comments

/*
* This 
* is
* Multi-Line
* Comments
* 
* */
public class _02_DataTypes {
	final static int classConstant = 3; //Class Constant
	public static void main(String[] args) {
		// 🔹 Primitive Data Types
		byte smallNumber = 127;
		short shortNumber = 32767;
		int integerNumber = 100000;
		long largeNumber = 9223372036854775807L;
		float floatNumber = 3.14f;
		double doubleNumber = 3.14159265358979;
		char letter = 'A';
		boolean isJavaFun = true;
		
		// 🔹 For Constants
		final double PI = 3.14;
		

		// 🔹 Non-Primitive Data Types
		String message = "Hello, Java!";
		int[] numbers = { 10, 20, 30, 40, 50 };
		
		// 🔹 Enumeration
		enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
		Size s = Size.MEDIUM;
		
		// 🔹 Wrapper Classes (Autoboxing Example)
		Integer intObj = integerNumber; // Autoboxing int to Integer
		Double doubleObj = doubleNumber; // Autoboxing double to Double
		Boolean boolObj = isJavaFun; // Autoboxing boolean to Boolean

		// 🔹 Displaying Primitive Data Types
		System.out.println("Primitive Data Types:");
		System.out.println("Byte: " + smallNumber);
		System.out.println("Short: " + shortNumber);
		System.out.println("Integer: " + integerNumber);
		System.out.println("Long: " + largeNumber);
		System.out.println("Float: " + floatNumber);
		System.out.println("Double: " + doubleNumber);
		System.out.println("Character: " + letter);
		System.out.println("Boolean: " + isJavaFun);
		
		System.out.println("Value of Constant PI : " + PI);
		System.out.println("Value of classConstant : " + classConstant);

		// 🔹 Displaying Non-Primitive Data Types
		System.out.println("\nNon-Primitive Data Types:");
		System.out.println("String: " + message);

		System.out.print("Array Elements: ");
		for (int num : numbers) {
			System.out.print(num + " ");
			
		}
		System.out.println();
		
		System.out.print("Enumerated Value : "+ s);

		// 🔹 Displaying Wrapper Class Values
		System.out.println("\nWrapper Classes:");
		System.out.println("Integer Object: " + intObj);
		System.out.println("Double Object: " + doubleObj);
		System.out.println("Boolean Object: " + boolObj);

		// 🔹 Class & Object Example (Person Class)
		Person p1 = new Person("Alice", 25);
		p1.display();
	}
}

// 🔹 Class Definition Inside the Same Java File
class Person {
	String name;
	int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display object data
	public void display() {
		System.out.println("\nClass & Object Example:");
		System.out.println("Person Name: " + name + ", Age: " + age);
	}

}
