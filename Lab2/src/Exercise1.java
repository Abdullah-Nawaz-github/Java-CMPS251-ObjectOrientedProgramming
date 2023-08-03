
/*Write an application to read the wattage (or watts) of a standard light bulb and assign
to a variable called lumens the expected brightness of that bulb.*/

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {

	public Exercise1() {

	}

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
				}
			}
				public class AccountTest {
				public static void main(String[] args) {
				       Account acc = new Account();
			       System.out.println(acc.getName());
			       acc.deposit(600);
				       System.out.println(acc.getBalance());
				}
				}

	
		
		
		

}
