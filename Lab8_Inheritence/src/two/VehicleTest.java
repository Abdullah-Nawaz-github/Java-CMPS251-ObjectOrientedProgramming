package two;

public class VehicleTest {
	public static void main(String a[]) {
		
		Vehicle bicycle = new Vehicle(2, 20);
		
		Car toyota = new Car(4, 2000, 5);
		
		Car sedan = new Car();
		sedan.setWheels(4);
		sedan.setPassengers(4);
		sedan.setWeight(1500);
		
		System.out.println(bicycle);
		System.out.println(sedan);
		System.out.println(toyota);
		System.out.println(toyota.getAsCSV());
		System.out.println(bicycle.getAsCSV());

	}
}