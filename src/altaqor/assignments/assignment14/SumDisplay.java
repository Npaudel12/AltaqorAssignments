package altaqor.assignments.assignment14;

public class SumDisplay {

	public static void main(String[] args) {
		 // sum of natural number from 200 to 300
		int sum = 0;
		int i = 200;
		while(i<=300) {
		 sum+= i; 
		i++;
		}
		System.out.println("Sum of natural number from 200 to 300 : " + sum);
}
}