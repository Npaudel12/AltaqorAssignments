package altaqor.assignments.assignment12;

import java.util.Scanner;

public class EmployeeInfo {
	
	 public static String firstName;
	 public static String lastName;
	 public static String gender;
	 public static int age;
	 public static double salary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // EmployeeInfo empInfo = new EmployeeInfo();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter your First Name:");
		firstName = sc.nextLine();
		
		System.out.println("Please enter your last Name:");
		lastName = sc.nextLine();
		
		System.out.println("Please enter your Gender:");
		gender = sc.nextLine();
		
		System.out.println("Please enter your age:");
		 age = sc.nextInt();
		 
		System.out.println("Please enter your salary:");
		salary = sc.nextDouble();
		
		System.out.println("\n Current Employee Details: \n" + " First Name:   "+ firstName + "\n"
				 + " Last Name: " + lastName + "\n" + " Gender:  " + gender + "\n" + " Age :" + age +
				 "\n" + " Salary:  " + salary);
	}

}
