package altaqor.assignments.assignment23;

import java.util.Arrays;
import java.util.Scanner;

/*Write a Java program that prompts the user to enter the size of an array,
creates an array of that size, allows the user to enter elements into the array, 
and then displays all the elements of the array.*/


public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for ( int i = 0; i < size; i++) {
			System.out.print("Please enter the elements of an arry: ");
			 int elements = sc.nextInt();
			 arr[i] = elements;
			 
		}
		System.out.println("New Array: " + Arrays.toString(arr));
	}

}
