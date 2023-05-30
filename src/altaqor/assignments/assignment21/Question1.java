package altaqor.assignments.assignment21;



public class Question1 {

	public static void main(String[] args) {
		BankAccount cur  = new CurrentAccount();
		cur.deposit(10000.00);
		cur.withdraw(200.00);
		cur.getBalance();
		cur.calculateIntrest();
		
	   BankAccount sav = new SavingAccount();
	   sav.deposit(60000.00);
	   sav.withdraw(200.00);
	   sav.getBalance();
	   sav.calculateIntrest();
	}

}
