
import java.util.ArrayList;

public class CarTester {

	public CarTester() {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("A123", "Toyota", 50000));
		cars.add(new Car("B123", "Honda", 40000));
		cars.add(new Car("C123", "Nissan", 60000));
		cars.add(new Car("D123", "Ford", 30000));

		// Write the objects of the list "theCars" to the file "carsfile" as objects.
		CarRepo.writeToObjFile("carsfile", cars);
		// Read the cars objects from the file "carsfile" into the list "theCars"
		ArrayList<Car> theCars;
		theCars = CarRepo.readFromObjFile("carsfile");
		for (Car c : theCars) {
			System.out.println(c.toString());
		}
//		// modify some the second car object by adding 2000 to the price.
		theCars.get(1).setPrice(theCars.get(1).getPrice() + 2000);
//		// write the data of the cars objects of the list "theCars" to a text file
//		// "carsfile.txt"
		CarRepo.writeToTextFile("carsfile.txt", theCars);
		// Read the data of the cars object from the text file "carsfile.txt" into the
		// list theCars2.
		
		ArrayList<Car> theCars2 = CarRepo.readFromTextFile("carsfile.txt");
		
		// Add the car objects of the list "theCars2" to the list "theCars"
		
		for (Car c : theCars2) {
			theCars.add(c);
		}
		
		// Display the contents of the list "theCars".
		
		for (Car c : theCars) {
			System.out.println(c.toString());
		}
	}

	public static void main(String[] args) {
		new CarTester();

	}
}
