package altaqor.assignments.assignment21;
     

public class SavingAccount implements BankAccount{
	
    private double balance;
	private double deposit;
	private double withdraw;
	private double intrest;
	

	@Override
	public void deposit(double amount) {
		
		deposit = amount;
		System.out.println("Saving Account details");
		System.out.println("Deposit Amount: " + deposit);
		balance = balance + amount;
		
	}

	@Override
	public void withdraw(double amount) {
		withdraw = amount;
		System.out.println("Withdraw Amount: " + withdraw);
		balance = balance - amount;
		
	}

	@Override
	public void getBalance() {
	    balance = balance;
	    System.out.println("Your Blance on Saving Account: " + balance);
		
	}

	@Override
	public void calculateIntrest() {
	 
		if ( balance >= 10000.00) {
			intrest = 0.04 * balance;
			System.out.println("Intrest  :" + intrest);	
			
		}else 
		  intrest = 0.01 * balance;
		//System.out.println("Intrest  :" + intrest);	
	}
		/// need some sugestion here
				
	}


