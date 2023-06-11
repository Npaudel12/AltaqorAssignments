package altaqor.assignment.assignment17;

import java.util.Scanner;

/*Write a Java program that takes a string as input and checks if it is a single character or not.
 *  If the string is a single character, print "String is a single character"; 
 *  otherwise, print "String is not a single character". 
 */

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word or character: ");
		String word = sc.nextLine();
		if (word.length()==1) {
			System.out.println(" Given string is a single character");
		}
		else {
			System.out.println("Given string is not a single character");
		}


	}

}
