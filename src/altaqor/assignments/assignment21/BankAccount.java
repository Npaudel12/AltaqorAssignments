package altaqor.assignments.assignment21;

public interface BankAccount {
	public  double balance =0;
	public double deposit = 0;
	public double withdraw = 0;
	public double intrest =0;
	
	
	public void deposit(double amount);
	public void withdraw(double amount);
	public void getBalance();
	public void calculateIntrest();
	
	

}