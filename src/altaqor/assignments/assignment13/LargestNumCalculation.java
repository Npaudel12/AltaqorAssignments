package altaqor.assignments.assignment13;

import java.util.Scanner;

public class LargestNumCalculation {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Please enter second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Please enter third number: ");
		double num3 = sc.nextDouble();
		
		double largest = num1;
		
		if (num2 > largest) {
			largest = num2;	
		}
		
		 if (num3> largest) {
			largest = num3;
			
		}
		 System.out.println("Largest number is " + largest);
		
	}

}
