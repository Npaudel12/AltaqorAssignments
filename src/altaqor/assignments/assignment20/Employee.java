package altaqor.assignments.assignment20;

public class Employee {
	private String name;
	private double salary;
	
	// constructor 
	public  Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}
	// method
	public void displayInfo() {
		
		System.out.println("Full name :  " +  name);
		System.out.println("Salary: " + salary);
		
	}

}
