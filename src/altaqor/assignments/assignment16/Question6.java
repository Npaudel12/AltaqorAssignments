package altaqor.assignments.assignment16;

import java.util.Scanner;

public class Question6 {
	//Write a java program to calculate the sum of number if user input the negative number, it should not include in the result.  
	//(Use continue)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		while(true) {
		System.out.print("please enter the number: ");
		int inputNum = sc.nextInt();
		//sum = sum + inputNum;
		
		
		if(inputNum<0) {
			
			continue;
			
		} 
		sum = sum + inputNum;
		System.out.println("sum of the number you entered:  " + sum);
		}
		
		//System.out.println("sum of the number you entered " + sum);
		
   
	}
	
}
