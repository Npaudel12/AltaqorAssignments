package altaqor.assignments.assignment10;

public class DepartmentTest {

	public static void main(String[] args) {


		// calling static method from Department class
		String deptName = Department.getDepartmentName("IPD");
	
		System.out.println("Name of the Specific department:   " + deptName + "\n" );
		
		Department.setDepartmentName();
		
		int a = Department.getDepartmentCount(10);
		System.out.println("Number of department in the Comapny:  " + a);
		
		
		
	}

}
