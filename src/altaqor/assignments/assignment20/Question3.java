package altaqor.assignments.assignment20;
/* Finally, create objects of both SavingsAccount and CurrentAccount
classes and invoke the displayInfo() method on each object.
 */

public class Question3 {

	public static void main(String[] args) {
		
		SavingAccount sav = new SavingAccount("456712", 5600.00, 0.02);
		sav.displayInfo();
		CurrentAccount curr = new CurrentAccount("12345", 4500.00, 10000.00);
		curr.displayInfo();
		


	}

}
