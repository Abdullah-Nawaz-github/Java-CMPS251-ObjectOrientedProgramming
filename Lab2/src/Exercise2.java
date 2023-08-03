
//Y=1/2+3/4+5/6+...+n/(n+1) n is an odd number entered by user.
import java.util.Scanner;

public class Exercise2 {

	public Exercise2() {

	}

	public static void main(String[] args) {
		class Account{
		private String name;
		private double balance;
		public Account(double balance) {
		 this.balance = balance;
		}
		public void deposit(double amount) {
		 balance=amount;
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
		 }}
		 public class AccountTest {
		 public static void main(String[] args) {
		 Account acc = new Account(1000.0, “Ahmed”);
		 System.out.println(acc.getName());
		 acc.deposit(600);
		 System.out.println(acc.getBalance());
		 }}

}
}
