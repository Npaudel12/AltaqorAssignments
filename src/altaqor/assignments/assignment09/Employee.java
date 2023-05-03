package altaqor.assignments.assignment09;

public class Employee {
	
	public  static String empName = "Narayan Paudel";
	protected  static int empID = 123;
	public static double empSalary =  4500.00;
	String address = "Omaha NE";
	String phNumber = "4023256789l";
	
	public void empAddress() {
		
		System.out.println("Full address of employee: " + address );
		
	}
	
    protected void empBenefits() {
    	
    	System.out.println("Benifits of employee: Comany has great benefits including health and life insurence, 401k Match etc");
    
    }
    
    void empContact() {
    	
    	System.out.println("Contact number of  employee: " + phNumber );
    	
    }
    
    

}
