package Exercise1;

public class SavingAccount {

	private int accountNo;
	private double balance;
	private static double interestRate;
	// don't need setter for interestRate. don't need to have it in constructors.
	// don't need to change it later
	private static int countInstance;
	private Date openDate;

	public SavingAccount() {
		setCountInstance(getCountInstance() + 1); // increment count like this
		this.openDate=new Date(1,1,2010); //initialize Date
	}

	public SavingAccount(int accountNo, double balance/* , double interestRate */,Date openDate) {
		this();
		this.setAccountNo(accountNo); // can use this.setAccountNo();
		this.setBalance(balance);
		this.openDate=openDate;
		// this.interestRate = interestRate; no need to initialize static
	}
	

	public Date getOpenDate() {
		return openDate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//only getters
	public static double getInterestRate() {
		return interestRate;
	}

// no need for a setter for static variables. can have a setter like this 
	public static void setInterestRate(double interestRate) {
		SavingAccount.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "AccountNo:" + accountNo + "\nBalance:" + balance + "\nInterest rate:" + interestRate
				+ "\nCount Instance:" + getCountInstance()+"\nOpen Date:" + openDate;
	}

	public static int getCountInstance() {
		return countInstance;
	}

	public static void setCountInstance(int countInstance) {
		SavingAccount.countInstance = countInstance;
	}

}