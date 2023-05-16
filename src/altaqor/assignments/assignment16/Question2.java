package altaqor.assignments.assignment16;

public class Question2 {
	
	/*Write a Java program that uses a "for each" loop to iterate over a list of doubles 
	and calculates the sum of all the numbers. Print the sum at the end.*/
	
public static void main(String[] args) {
	
	double [] doubNum = {1.2, 3.2, 2.4, 2.6,8.9};
	
	System.out.println("List of double number from array: ");
	
	double sum =0;
	for(double data: doubNum) {
		
		System.out.println(data);
		sum = sum + data;	
	}
	
	System.out.println("Sum of the double number in an array:  " + sum);
	
	
	
}
}
