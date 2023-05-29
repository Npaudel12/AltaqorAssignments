package altaqor.assignments.assignment20;
/*Create a class called BankAccount with instance variables accountNumber and balance. 
 * Implement a parameterized constructor to initialize these variables. Include a method 
 * called displayInfo() in the BankAccount class that displays the account number and
 *  balance.
 * 
 */

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    }
    	
    	public void displayInfo() {
    		balance = balance;
    		System.out.println("Account Number: " + accountNumber);
    		System.out.println("Balance: " + balance);
    	}
    	
    }

