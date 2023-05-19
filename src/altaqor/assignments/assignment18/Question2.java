package altaqor.assignments.assignment18;
/*Create a Java class called "BankAccount" with the following requirements:
It should have private instance variables: "accountNumber" (String), "balance" (double), and "password" (String).
Implement a parameterized constructor that accepts values for accountNumber, balance, and password and initializes the instance variables.
Provide getter and setter methods for balance and password.
Implement a method called "withdraw" that accepts the withdrawal amount as a parameter. Ensure that the withdrawal amount does not exceed the balance. If it does, display an appropriate error message.
Create an object of the BankAccount class, set an initial balance and password, and perform a withdrawal operation.
 * 
 */

public class Question2 {

	public static void main(String[] args) {
		
		BankAccount bankaccount = new BankAccount("34456", "bank123!", 1234.00);
		bankaccount.withDraw(450);

	}

}
