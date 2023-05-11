package altaqor.assignments.assignment14;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Provide the number of your choice:  ");
		int num = sc.nextInt();
		System.out.println("Multiplication table for " + num + " are:  ");
		int i = 1;
		
		while( i<=10) {
			
			int result = num * i;
			System.out.println(result);
			i++;
			
		}
	}

}
