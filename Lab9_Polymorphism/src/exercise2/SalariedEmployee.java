package exercise2;

public class SalariedEmployee extends Employee{
	
	private double salary;
	
	public SalariedEmployee() {
	}

	public SalariedEmployee(String firstName, String lastName, String qid, double salary) {
		super(firstName, lastName, qid);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}

	@Override
	public double getPaymentAmount() {
		return this.getSalary();
	}
	
	

}
