package altaqor.assignments.assignment16;

import java.util.Scanner;

//Write a Java program calculate the sum of numbers if user input the negative numbers, then terminate the loop. (Use break)

public class Question5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("Please enter number of your choice: ");
			int inputNum = sc.nextInt();
			
			 if (inputNum< 0) {
				 break;
			 }
			 sum = sum +inputNum;
				 
			
		}
		System.out.println("Sum of number you entered : " + sum);
		
	}
}

