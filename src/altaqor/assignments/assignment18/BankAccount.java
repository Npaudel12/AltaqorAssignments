package altaqor.assignments.assignment18;

public class BankAccount {
	
	private String aacountNumber;
	private String password;
	private double balance;
	
	public BankAccount(String accountNumber, String password, double balance) {
		this.aacountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public   int withDraw(int withDrawAmount) {
		
		if (withDrawAmount > balance) {
			System.out.println(" Sorry, you dont have enough money to withdarw.");
		   balance = balance;
		}else
		
		balance = balance -withDrawAmount;
		System.out.println("Your current balance:  " + balance);
		return withDrawAmount;
		
	}

}

