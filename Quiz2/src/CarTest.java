import java.util.*;
public class CarTest {

	public CarTest() {
		Car Car1=new Car("Camry",2020,"Blue",77000.0);
		Car Car2=new Car("CX5",2021,"Red",90000.0);
		Car Car3=new Car("A8",2022,"Blue",150000.0);
		Car Car4=new Car("Sportage",2020,"Black",110000.0);
		
		ArrayList <Car> allCars=new ArrayList<>();
		allCars.add(Car1);
		allCars.add(Car2);
		allCars.add(Car3);
		allCars.add(Car4);
		
		ArrayList <Car> blueCars=new ArrayList<>();
		blueCars.add(Car1);
		blueCars.add(Car3);

		for (Car i:blueCars) {
			System.out.println(i); //will call the toString() method of Car
		}
	}

	public static void main(String[] args) {
		new CarTest();
		
		

	}

}
