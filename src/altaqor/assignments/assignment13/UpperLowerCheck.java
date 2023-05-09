package altaqor.assignments.assignment13;

import java.util.Scanner;

public class UpperLowerCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the letter: ");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(" The letter you enter " + ch+ " is uppercase");
		}else if ( ch >= 'a' && ch <='z') {
			System.out.println(" The letter you enter " + ch+ " is lowercase");
			
		}else
		{
		System.out.println(("Please just enter one letter"));
		}
			
	}

}
