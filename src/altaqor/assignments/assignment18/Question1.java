package altaqor.assignments.assignment18;
/*
 Write a Java class called "Person" with the following requirements:
It should have two private instance variables: "name" (String) and "age" (int).
Implement a parameterized constructor that accepts values for name and age and initializes the instance variables.
Provide getter and setter methods for both variables.
Create an object of the Person class and display the values using getter methods.

 */
public class Question1 {

	public static void main(String[] args) {
		Person person = new Person(40, "Narayan");
		int ag = person.getAge();
		String nm = person.getName();
		System.out.println("Your Age: " + ag);
		System.out.println("Your Name: " + nm);
	}

}
