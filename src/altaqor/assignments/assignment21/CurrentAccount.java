package altaqor.assignments.assignment21;

public class CurrentAccount implements BankAccount {
	private double balance;
	private double deposit;
	private double withdraw;
	private double intrest;
	
	

	@Override
	public void deposit(double amount) {
		deposit =  amount;
		balance = balance + amount;
		System.out.println("Current Account Details");
		System.out.println("Deposit Amount: "  + amount);
		
	}

	@Override
	public void withdraw(double amount) {
		withdraw = amount;
		balance = balance - amount;
		System.out.println("Withdraw Amount: " + amount);
		
		
	}

	@Override
	public void getBalance() {
		balance = balance; 
		
		System.out.println("Your Balance: " + balance );
		
		
	}

	@Override
	public void calculateIntrest() {
	intrest = 0;
	balance = balance + intrest;
    System.out.println("Intrest in current account: " + intrest + "\n");
		
		
	}

}
