package altaqor.assignments.assignment19;

public class SavingAccount extends BankAccount {
	private String savAccNumber;
	private double balance;
	private double amount; 
	
	public   SavingAccount(String savAccNumber, double amount) {
		this.savAccNumber = savAccNumber;
		this.amount = amount;
		;
	}

	@Override
	public double getBalance() {
		balance = amount;
		System.out.println("Saving Account " + savAccNumber + "  Details: ");
		System.out.println("Your Current Balance: " + balance);
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Your new balance after deposit:" +  balance);
		
		
	}

	@Override
	public void withdraw(double amount) {
		if (balance>= amount) {
			balance = balance - amount;
			System.out.println("Your recent balance after withdraw:  " + balance + "");
			}else {
				System.out.println("you dont have sufficent money to withdraw.");
			}
	}
	
	public double CalculateIntrest() {
		double intrest;
		
		if (balance >= 10000.00) {
			intrest = balance * 0.02;
			balance = balance + intrest;
		System.out.println("You currently get 2% intrest");
		}
		
			else if(balance >= 20000.00 ) {
				intrest = balance * 0.04;
				balance = balance + intrest;
				System.out.println("You currently get 4% intrest");
			}
			else {
				intrest = balance * 0;
				balance = balance + intrest;
				System.out.println("You didnot get any intrest this time");
				
			}
			
		
		return intrest;
	}

}
