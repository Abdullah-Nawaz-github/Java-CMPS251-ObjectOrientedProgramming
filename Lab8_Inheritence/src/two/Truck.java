package two; 

public class Truck extends Vehicle {
	private int loadCapacity;

	public Truck() {}

	public Truck(int wheels, int weight, int loadCapacity) {
		super(wheels, weight);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + "]";
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public double getWheelLoad() {
		return ((double)(loadCapacity+getWheels())/getWheels());
	}

}
