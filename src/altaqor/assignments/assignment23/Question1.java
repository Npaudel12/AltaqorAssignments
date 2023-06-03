package altaqor.assignments.assignment23;

import java.util.Arrays;

//Write a program to copy the contents of one array to another.

public class Question1 {

	public static void main(String[] args) {
		
		// old array
		String[] oldArray = {"Hari", "Ram", "Umesh", "Gita", "Sita"};
		
		// size of old array
		 int size = oldArray.length;
		
		// new arry
		String[] newArray = new String[size];
		
		// passing string values from old to new array using for loop
		for (int i =0; i<size; i++) {
			newArray[i] = oldArray[i];
			System.out.println("New Array Elements " +  i +  ":"  + newArray[i]);
			
		}
		System.out.println("New Array: " + Arrays.toString(newArray));
		
		

	}

}
