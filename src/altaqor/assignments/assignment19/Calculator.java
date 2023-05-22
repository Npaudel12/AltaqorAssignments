package altaqor.assignments.assignment19;

public class Calculator {

	
	public int add( int a, int b) {
	int 	sum = a + b;
		System.out.println("Sum of " + a + "  &  " + b + ":  " + sum);
		
		return sum;
	}
	
	public double add(double a, double b) {
		double sum = a + b;
       System.out.println("Sum of " + a + "  &  " + b + ":   " + sum);
		
		return sum;
		
	}

	public int add(int a, int b , int c) {
		int sum = a +b +c;
		System.out.println("Sum of three numbers: " + sum);
		return sum;
	}
}
