package altaqor.assignments.assignment20;
/*  Create a subclass called SavingsAccount that extends the BankAccount class and 
 * adds an instance variable interestRate. Implement a parameterized constructor in the 
 * SavingsAccount class to initialize the variables of both BankAccount and SavingsAccount.
 *  Override the displayInfo() method in the SavingsAccount class to display the account 
 *  number, balance, and interest rate
*/
public class SavingAccount extends BankAccount {
	private double intrestRate;
	public SavingAccount(String accountNumber, double balance, double intrestRate) {
		super(accountNumber, balance);
		this.intrestRate = intrestRate;
		
	}
	@Override
	 public void displayInfo() {
		super.displayInfo();
		System.out.println("Intrest Rate: " + intrestRate + "\n");
		 
	 }
	

}
