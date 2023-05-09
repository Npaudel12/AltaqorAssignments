package altaqor.assignments.assignment13;

import java.util.Scanner;

public class BmiCalculation {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your weight in kilogram:  ");
		double weight = scan.nextDouble();
		
		System.out.println("Please enter your height in meter:  ");
		double height = scan.nextDouble();
		double bmi = weight/(height*height);
		
		if(bmi<18.5) {
			System.out.println("BMI Result" + bmi + ": Underweight");
		}
		else if(bmi<25.0){
			System.out.println("BMI Result" + bmi + ": Normal Weight");
			
		}else if(bmi<30){
			System.out.println("BMI Result" + bmi + ": Over weight");
			
		}
		else {
			System.out.println("BMI Result:   " + bmi + ": Obese");
		}
			
		
	}

	

}
