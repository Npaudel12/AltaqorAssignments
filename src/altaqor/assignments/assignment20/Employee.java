package altaqor.assignments.assignment20;
/*Create a class called Employee with instance variables name and salary. 
  Implement a parameterized constructor to initialize these variables. 
 Include a method called displayInfo() in the Employee class that displays the name and 
  salary of the employee. 
 */

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
