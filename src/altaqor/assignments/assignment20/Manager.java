package altaqor.assignments.assignment20;
/*Create a subclass called Manager that extends the Employee class and adds an instance 
  variable bonus. Implement a parameterized constructor in the  Manager class to initialize
  the variables of both Employee and Manager. Override the displayInfo() method in the 
  Manager class to display the name,  salary, and bonus of the manager.
 */

public class Manager extends Employee {
	private double bonus;
	
	public Manager(String name, double salary, double bonus) {
	
		super(name,salary);
		this.bonus = bonus;	
	}
	
	@Override
	public void displayInfo() {
		
	System.out.println("Manager Details");
	super.displayInfo();	
	System.out.println("Bonus: " + bonus);
	
	}

}
