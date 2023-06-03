package altaqor.assignments.assignment22;

import java.util.Scanner;

/*Write a Java program that asks the user to enter two numbers and divide the 
first number by the second number. Handle the possible exception of dividing by zero.
*/

public class Question1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Please Enter First Number: ");
		 int num1 = sc.nextInt();
		 System.out.print("Please Enter First Number: ");
		 int num2 = sc.nextInt();
		 
		 
			 try {
				 int result = num1/ num2;
				 
				 System.out.println("Result, division : " + result);
			 }catch(Exception e) {
				 System.out.println("Error message :"  + e.getMessage());
				 
			 }
		
		 

	}

}
