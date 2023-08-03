package two;

public class Car extends Vehicle {
	private int passengers;

	public Car() {
	}

	public Car(int wheels, int weight, int passengers) {
		super(wheels, weight);
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Passengers : " + passengers;
	}
	
	@Override
	public String getAsCSV() {
		String output=getWheels()+", "+getWeight()+", "+passengers+", "+getClass().getSimpleName ();
		return output;
		
	}
}