package altaqor.assignments.assignment19;
/*Create an abstract class named "BankAccount" representing a generic bank account. 
 * It should have abstract methods: double getBalance(), void deposit(double amount), and void withdraw(double amount). 
 * Implement the "BankAccount" class for two specific types of accounts: "SavingsAccount" and "CheckingAccount". 
 * The "SavingsAccount" class should have an additional method double calculateInterest() to calculate interest based on the balance.
 *  The "CheckingAccount" class should have an additional method void deductFees() to deduct applicable fees. 
 *  Ensure all accounts have a unique account number that cannot be modified once set. 
 *  Provide appropriate constructors for each class. Write a sample program demonstrating the usage of both account types, 
 *  performing transactions such as deposits, withdrawals, interest calculations, and fee deductions while utilizing abstraction
 *   to hide implementation details.

 * 
 */

public class Question2 {

	public static void main(String[] args) {
		
		//object of Checking account
		CheckingAccount chk = new CheckingAccount(" 78910", 5000.00);
		chk.getBalance();
		chk.deposit(2000.00);
		chk.withdraw(100.00);
		chk.deductFees();
		
		
		
	
		// creating object SavingAccount class
		SavingAccount sav = new SavingAccount("45678", 200.00);
		sav.getBalance();
		sav.deposit(2000.00);
		sav.withdraw(300.00);
		sav.CalculateIntrest();
		
	
	}

}
