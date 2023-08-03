import java.io.Serializable;

public class Car implements Serializable {
	private String plateNo;
	private String make;
	private double price;

	public Car(String plateNo, String make, double price) {
		this.setPlateNo(plateNo);
		this.setMake(make);
		this.setPrice(price);
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [plateNo=" + plateNo + ", make=" + make + ", price=" + price + "]";
	}

}
