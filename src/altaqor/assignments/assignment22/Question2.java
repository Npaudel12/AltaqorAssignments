package altaqor.assignments.assignment22;

import java.util.Scanner;

/*Write a Java program that reads an integer from the user and computes its square. 
 * Handle the NumberFormatException that occurs if the user inputs a non-numeric value.
 * 
 */
public class Question2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Please enter a number I will display its square : ");
		String num1 = sc.nextLine();
		 try {
			 int num2 = Integer.parseInt(num1);
			 int  result = num2*num2;
			 System.out.println("Result, square of given number:  " + result);
		 }catch(NumberFormatException e ){
			 System.out.println("Try to enter valid number");
			 System.out.println("Error message: " + e.getMessage());
			 
			 
		 }
		 sc.close();

	}

}
