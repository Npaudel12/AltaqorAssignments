package altaqor.assignments.assignment12;

public class UnaryOperation {
	
	public void increment() {
		
		int i = 2;
		i++;
		System.out.println("Result of increment: " + i) ;
	}
	
	public void decrement() {
		int j = 4;
		j--;
		System.out.println("Result of decrement: " + j) ;
		
	}

	public static void main(String[] args) {
		UnaryOperation unp = new UnaryOperation();
		unp.increment();
		unp.decrement();
		
		

	}

}
