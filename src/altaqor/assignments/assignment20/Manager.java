package altaqor.assignments.assignment20;

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
