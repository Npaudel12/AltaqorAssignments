package altaqor.assignments.assignment13;

import java.util.Scanner;

public class CheckSquareRect {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length:  ");
		double length = sc.nextDouble();
		
		System.out.println("Please enter the breadth:  ");
		double breadth = sc.nextDouble();
		
		if(length==breadth) {
			System.out.println(" This is a Square");
		}
		else {
		System.out.println("This is Reactagle");
		}
		
	}

}
