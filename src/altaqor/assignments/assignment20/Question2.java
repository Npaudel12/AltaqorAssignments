package altaqor.assignments.assignment20;
/*Create a class called Employee with instance variables name and salary. 
  Implement a parameterized constructor to initialize these variables. 
 Include a method called displayInfo() in the Employee class that displays the name and 
  salary of the employee. Create a subclass called Manager that extends the Employee class
  and adds an instance variable bonus. Implement a parameterized constructor in the 
  Manager class to initialize the variables of both Employee and Manager.
    Override the displayInfo() method in the Manager class to display the name, 
    salary, and bonus of the manager. Finally, create an array of Employee objects 
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
