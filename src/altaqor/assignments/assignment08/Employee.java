package altaqor.assignments.assignment08;

public class Employee {
	
	// static variable
	private static int employeeCount = 100;
	private static String companyName = "NPSoftware";
	
	// instance variable
	int Id = 110;
	String name = "Bibek Paudel";
	double salary = 5500.00;
	

	public static void main(String[] args) {
		
	// local variable
	String department = "Software Testing";
	double taxRate = 0.05;
	
	// printing static variable 
	System.out.println("\n **********Static variable**************\n");
	System.out.println("Name of the company:  " + companyName);
	System.out.println("Number of employee in the company:  " + employeeCount);
	
	//printing local variable 
	System.out.println("\n\n ***********Loacl Variable*************\n");
	System.out.println("Employee Department:  "  + department);
	System.out.println("Employee tax rate:   " + taxRate);
	
	
	// creating object of the employee class
	
	Employee employee = new Employee();
	
	// printing instance variable with the help of employee object
	System.out.println("\n\n*******Instance variable***********\n");
	System.out.println("Employee Name:  "+  employee.name);
	System.out.println("Employee ID:   "  + employee.Id);
	System.out.println("Employee Salary:   " +  employee.salary);
	
	}

}
