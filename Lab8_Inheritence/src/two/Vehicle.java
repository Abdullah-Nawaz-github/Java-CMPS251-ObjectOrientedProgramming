package two;

public class Vehicle {
	private int wheels;
	private int weight;

	public Vehicle() {}

	public Vehicle(int wheels, int weight) {
		this.wheels = wheels;
		this.weight = weight;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getAsCSV() {
		String output=wheels+", "+weight+", "+getClass().getSimpleName ();
		return output;
	}
	
	@Override
	public String toString() {
		String dashes = "";
		String className = getClass().getSimpleName();
		for (int i = 0; i < className.length(); i++)
			dashes += "-";
		return "\n" + className + "\n" + dashes + "\n wheels : " + wheels + "\n weight : " + weight;
	}
}