package altaqor.assignments.assignment13;

import java.util.Scanner;

public class AbsoluteCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:  ");
		double num = sc.nextDouble();
		double abslt = Math.abs(num);
		
		System.out.println("The absolute value of  " + num +"  is " + abslt);
		

	}

}
