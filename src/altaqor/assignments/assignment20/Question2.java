package altaqor.assignments.assignment20;
/* Finally, create an array of Employee objects 
    that can store both employees and managers. Populate the array with instances of 
    both classes and iterate over the array, calling the displayInfo() method for each 
    object to display the information.
 */

public class Question2 {

	public static void main(String[] args) {
		// array of an object of Employee class
		Employee [] emp = new Employee[2];
		
		// passing data to an array
		emp [0]  =  new Employee("Narayan Paudel", 2000.00);
		emp[1]  = new Manager("Ganesh Paudel", 5000.00, 200.00);
		for(Employee data: emp) {
		data.displayInfo();
		}
	

	}

}
