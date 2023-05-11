package altaqor.assignments.assignment14;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Provide the number of your choice:  ");
		int num = sc.nextInt();
		int factorial = 1;
		int i = 1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		System.out.println("Factorial of the number you entered " + num + "  is :==>  " + factorial);
	}

}
