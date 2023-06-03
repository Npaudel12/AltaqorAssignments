package altaqor.assignments.assignment23;
//Write a program to find the largest and smallest element in a List of integers.

import java.util.ArrayList;

public class listQuestion2 {

	public static void main(String[] args) {
		ArrayList < Integer> num  = new ArrayList<Integer>();
		num.add(1);
		num.add(4);
		num.add(10);
		num.add(90);
		int min = 4;
		int max = 4;
		
		for (int data: num) {	
		}
		System.out.println("ArrayList : " + num);
		
		for (int i = 0; i < num.size(); i++) {
			if ( num.get(i) < min) {
				min  = num.get(i);
			}
			
			
			if ( num.get(i) > max) {
				max  = num.get(i);
				
				
			}


		}
		System.out.println("Smallet element in the list: " + min);
		System.out.println("Largset element in the list: " + max);

	}

}
