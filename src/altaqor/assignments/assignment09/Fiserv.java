package altaqor.assignments.assignment09;

public class Fiserv {
	
	//Instance variable declaration
	String companyName = "Fiserv LLC";
	private static int numbEmployee = 800;
	
	
	public static void main(String[] args) {
		// local variable 
		String addressCompany = "7007 97th Circle Omaha, NE";
		double totalRev = 890000.00;
		
		// Printing local variable
		System.out.println("\n*************Local Variable*************");
		System.out.println(" Address of the company:  " + addressCompany);
		
		// printing instance and static variable
		System.out.println("\n****Instance variable************");
		
		//accessing instance variable by creating object of that class
		Fiserv fiserv = new Fiserv();
		System.out.println("Name of the Company:  " + fiserv.companyName);
		System.out.println("Number of Employee:   " + fiserv.numbEmployee + "\n");
		
		// object of the separate class employee
		Employee emp = new Employee();
		
	// accessing information from public method and variable 
		System.out.println("****public modifer***************");
		System.out.println("Full Name of the employee:   "  + Employee.empName);
		System.out.println("Monthly salary of the employee:  " + Employee.empSalary);
		emp.empAddress();
		System.out.println("\n");
		
	// accessing information from protected method and variable
		System.out.println("**********Protected modifer***********");
		System.out.println("Employee ID:    " +   Employee.empID);
		emp.empBenefits();
		System.out.println("\n");
		
	//accessing information from default method
		System.out.println("**********default modifier");
		emp.empContact();
		

	}

}
