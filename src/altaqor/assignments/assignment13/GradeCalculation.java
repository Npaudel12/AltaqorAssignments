package altaqor.assignments.assignment13;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please provide your Score: ");
		double score = sc.nextDouble();
		
		if ( score >=90) {
		System.out.println("Your grade :   A");
		}
		else if (score >=80 || score<= 89) {
			System.out.println("Your garde:    B");
		} 
		else if ( score >= 70 || score <= 79) {
			System.out.println("Your garde:   C");
		}
		else if (score >= 60 || score <= 69) {
			System.out.println("You garde:  D");
		}
		else {
			System.out.println("Sorry you fail, garde: F");
			
		}
				
	}

}
