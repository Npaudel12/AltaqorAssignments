package altaqor.assignments.assignment15;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//Java program to print the multiplication table of a given number using a for loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number, i will display multiplication table::");
		int num = sc.nextInt();
		
		
		for ( int i = 1; i<=10; i++) {
			int result = num *i;
			System.out.println( num +  "* " + i + "= " + result);
			
		}
		
	}

}
