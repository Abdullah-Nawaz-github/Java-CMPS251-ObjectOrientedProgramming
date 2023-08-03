class Account {
	private String name;
	private double balance;

	public Account(double balance) {
		this.name=name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}