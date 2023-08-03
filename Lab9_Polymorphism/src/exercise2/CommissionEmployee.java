package exercise2;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commisionRate;

	public CommissionEmployee() {
	}

	public CommissionEmployee(String firstName, String lastName, String qid, double grossSales, double commisionRate) {
		super(firstName, lastName, qid);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	// implement the method from the interface
	@Override
	public double getPaymentAmount() {
		return this.getCommisionRate() * this.getGrossSales();
	}

	@Override
	public String toString() {
		return "ComissionEmployee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + "]"
				+ super.toString();
	}

}
