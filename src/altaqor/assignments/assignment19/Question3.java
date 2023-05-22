package altaqor.assignments.assignment19;
/*Create a Java class named "Calculator" with overloaded methods for addition, 
 * including int add(int a, int b), double add(double a, double b), and int add(int a, int b, int c). 
 * Write a program to demonstrate the usage of these overloaded methods, showcasing their ability to handle different parameter types and numbers while utilizing method overloading in Java.
 */


public class Question3 {

	public static void main(String[] args) {
		
		// object of the class calculator
		Calculator cal = new Calculator();
		cal.add(4, 5);
		cal.add(5.9, 10.7);
		cal.add(6, 7, 8);
	}

}
