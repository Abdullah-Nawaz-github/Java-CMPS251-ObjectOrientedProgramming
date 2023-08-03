package Exercise1;

public class SavingAccountTest {

	public static void main(String[] args) {

		SavingAccount acc1 = new SavingAccount(1, 3000, new Date(1, 1, 2013));
		Date d2 = new Date(1, 1, 2018);
		SavingAccount acc2 = new SavingAccount(2, 4000, d2);

		System.out.println(acc1.toString());
		System.out.println(acc2); // toString auto called

		System.out.println("\nAfter updating\n=================");

		acc1.setBalance(3500);
//		acc1.setInterestRate(0.07);
		acc2.setAccountNo(4500);
//		acc2.setInterestRate(0.09);

		SavingAccount.setInterestRate(0.48); // access static
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(SavingAccount.getCountInstance());
		
		Date d3=new Date(1,1,2018);
		SavingAccount acc3=new SavingAccount(1,39348,d3);
		Customer c1=new Customer(456,"Ahmed",acc3);
		//Customer c1=new Customer(456,"Ahmed",new SavingAccount(1,39348,new Date(1,1,2018)));
		System.out.println("\nCustomer  = \n");
		System.out.println(c1);	
		
		Date d4=new Date(1,1,2018);
		SavingAccount acc4=new SavingAccount(1,39348,d4);
		Customer c2=new Customer(456,"John",acc4);
		System.out.println(c2);	

		System.out.println(openSameDay(c1,c2));
	}
	
//	In class SavingAccountTest, add method openSameDay that receives two objects of type
//	customers and returns true if both open their accounts in the same day (means same day, same
//	month, and same year), otherwise it returns false.
	public static boolean openSameDay(Customer c1,Customer c2) {
		// date of c1= c1.getAccount().getOpenDate() 
		//compare objects using .equals()
		Date dateC1=c1.getAccount().getOpenDate();
		Date dateC2=c2.getAccount().getOpenDate();
		if (dateC1.equals(dateC2)) {
			return true;
		} else {
		return false;}
	}
}