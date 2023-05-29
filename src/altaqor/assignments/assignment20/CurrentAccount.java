package altaqor.assignments.assignment20;
/*Create another subclass called CurrentAccount that extends the BankAccount class and 
 * adds an instance variable overdraftLimit. Implement a parameterized constructor in the 
 * CurrentAccount class to initialize the variables of both BankAccount and CurrentAccount. 
 * Override the displayInfo() method in the CurrentAccount class to display the account 
 * number, balance, and overdraft limit
 * 
 */

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
		
		
	}
	@Override
	public void displayInfo() {
		System.out.println("Current Account Details");
		super.displayInfo();
		System.out.println("Overdraft Limit:" + overdraftLimit);
	}
	
	

}
