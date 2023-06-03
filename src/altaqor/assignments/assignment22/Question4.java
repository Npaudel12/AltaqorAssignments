package altaqor.assignments.assignment22;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Please enter any thing you want : ");
		String num1 = sc.nextLine();
		 try {
			 int num2 = Integer.parseInt(num1);
			 System.out.println("Result:  " + num1);
		 }catch(NumberFormatException e ){
			 System.out.println("Enter valid number");
			 System.out.println("Error message: " + e.getMessage());
			 
			 
		 }
		 sc.close();

	}

}
