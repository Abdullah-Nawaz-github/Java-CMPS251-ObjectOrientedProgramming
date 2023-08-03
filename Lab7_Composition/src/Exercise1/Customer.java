package Exercise1;

public class Customer {
	
	private int id;
	private String name;
	private SavingAccount account;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id,String name,SavingAccount account) {
		this.setName(name);
		this.setId(id);
		this.setAccount(account);
	}
	
	public SavingAccount getAccount() {
		return account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(SavingAccount account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "id = "+id+"\nname = "+name+"\nSavingAccount = \n"+account.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
