package exercise2;

public class HourlyEmployee extends Employee{

	private double wage;
	private double hours;
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String firstName, String lastName, String qid, double wage, double hours) {
		super(firstName, lastName, qid);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		return this.getWage()*this.getHours();
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}
	
	

}
