package altaqor.assignments.assignment15;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Write a Java program to find the factorial of a number using a for loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number, i will display factorial::");
		int num = sc.nextInt();
		int factorial = 1;
		
		for(  int i = 1; i <=  num ; i++) {
			
			factorial = factorial * i;
			
		
		}
	
		System.out.println(factorial);

	}

}
