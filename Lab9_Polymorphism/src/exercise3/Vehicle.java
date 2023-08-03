package exercise3;

import java.time.LocalDate;
import java.util.Map;

public class Vehicle implements Cleanable {
	private String plateNumber;
	private int wheels;
	private int weight;
	private LocalDate registrationDate;
	private int cleaningCount;

	public Vehicle() {
	}

	public Vehicle(String plateNumber, int wheels, int weight, LocalDate registrationDate, int cleaningCount) {
		this.setPlateNumber(plateNumber);
		this.setWheels(wheels);
		this.setWeight(weight);
		this.setRegistrationDate(registrationDate);
		this.setCleaningCount(cleaningCount);
	}

	// setters and getters
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
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

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	// abstract method of interface
	@Override
	public Map<String, Integer> fees() {
		return Map.of("Car", 10, "Truck", 15, "Unit", 25, "Villa", 50);
	}

	@Override
	public int getFee(String s) {
		return fees().get(s);
	}

	@Override
	public void setCleaningCount(int i) {
		cleaningCount = i;
	}

	@Override
	public double getCleaningCount() {
		return cleaningCount * getFee(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		if (plateNumber.equals(null))
			return "";
		else
			return "[plateNumber: " + plateNumber + ", wheels: " + wheels + ", weight: " + weight
					+ ", registrationDate: " + registrationDate + ", cleaningCount: " + cleaningCount + "]";
	}

}
