
public class Car {
	private String model;
	private int year;
	private String color;
	private double price;

	public Car() {
		model = null;
		year = 0;
		color = null;
		price = 0.0;
	}

	public Car(String model, int year, String color, double price) {
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
		this.setPrice(price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		} else {
			this.year = 0;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0.0) {
			this.price = price;

		} else {
			this.price = 0;
		}

	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + "]";
	}

	public static void main(String[] args) {

	}

}
