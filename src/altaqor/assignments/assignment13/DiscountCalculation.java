package altaqor.assignments.assignment13;

import java.util.Scanner;

public class DiscountCalculation {
	
	     

	public static void main(String[] args) {
		
	    	  Scanner sc = new Scanner(System.in);
		      System.out.print("Please enter the number of quantity purchased:  ");
		      int qun = sc.nextInt();
		      double totalCost = qun * 100;
		      
		      if(totalCost > 1000) {
		    	  
		    	  double discount = totalCost * 0.1;
				  double finalCost = (totalCost - discount);
		    	  System.out.println("You got 10% discount:  " + discount);
		    	  System.out.println("Your final cost after disount: " + finalCost);
		    	 
		      } else {
		    	  System.out.println(" O sorry you did not got 10% discount");
		    	  System.out.println("Your total cost: " + totalCost);
		      }

	}

}
