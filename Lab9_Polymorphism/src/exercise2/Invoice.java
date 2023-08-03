package exercise2;

// not abstract so have to implement methods 
public class Invoice implements Payable {

	private String partNumber;
	private String partDescription;
	private double quantity;
	private double unitPrice;

	public Invoice(String partNumber, String partDescription, double quantity, double unitPrice) {
		super();
		this.setPartNumber(partNumber);
		this.setPartDescription(partDescription);
		this.setQuantity(quantity);
		this.setUnitPrice(unitPrice);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	// should be implemented with same signature
	@Override
	public double getPaymentAmount() {
		return (this.getQuantity()*this.getUnitPrice());
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + "]";
	}
	
}
