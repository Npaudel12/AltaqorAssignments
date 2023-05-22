package altaqor.assignments.assignment19;

public class CheckingAccount extends BankAccount {
	 private String chkAccNumber;
	 private double amount;
	 private  double balance;
	 public CheckingAccount(String chkAccNumber, double amount) {
		 this.chkAccNumber = chkAccNumber;
		 this.amount = amount;
	 }

	@Override
	public double getBalance() {
		balance = amount;
		System.out.println("Checking account  " + chkAccNumber + "Details:");
		System.out.println("Your Checking Account balance: "  + balance);
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Your current balance after deposit:  " + balance);
		
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
	 public double deductFees( ) {
		 if (balance <= 500) {
			 double fees = 10.00;
			 balance = balance - fees;
			 System.out.println("You charges " + fees + "  because your balnce falls below 500" + "\n");
		 }
		 else 
		 { 
			 balance = balance;
			 System.out.println("Your account does not have extra fees this time." + "\n");
		 }
		 return amount;
	 }

}
