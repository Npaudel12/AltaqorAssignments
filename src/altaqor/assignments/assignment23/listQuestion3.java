package altaqor.assignments.assignment23;
//Write a program to reverse the elements of a List of integers.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class listQuestion3 {

	public static void main(String[] args) {
		ArrayList < Integer> num  = new ArrayList<Integer>();
		
		num.add(1);
		num.add(4);
		num.add(10);
		num.add(90);
		// print
		System.out.println("Array: " + num);
		
		//reverse 
		Collections.reverse(num);
		System.out.println("Array after reverse: " + num);
			
		}	

	}


