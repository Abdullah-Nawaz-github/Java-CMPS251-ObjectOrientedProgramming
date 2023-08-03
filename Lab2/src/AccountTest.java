
public class AccountTest {
	public static void main(String[] args) {
		 Account acc = new Account(1000.0,"Ahmed");
		 System.out.println(acc.getName());
		 acc.deposit(600);
		 System.out.println(acc.getBalance());
		 }
}