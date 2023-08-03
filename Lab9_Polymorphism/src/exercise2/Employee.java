package exercise2;

public class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String qid;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String qid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.qid = qid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", qid=" + qid + "]";
	}

}
