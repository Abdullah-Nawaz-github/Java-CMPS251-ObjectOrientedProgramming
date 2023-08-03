import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class CarRepo {

	public static void writeToObjFile(String fileName, ArrayList<Car> cars) {
		try {
			ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(fileName));
			for (Car c : cars) {
				out1.writeObject(c);
			}
			out1.close();
			out1.flush();
		} catch (IOException io) {
		}
	}

	public static ArrayList<Car> readFromObjFile(String string) {
		ArrayList<Car> result = new ArrayList<>();
		try {
			Object obj;
			ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(string));
			while ((obj = in1.readObject()) != null) {
				Car c = (Car) obj;
				result.add(c);
			}
		} catch (IOException IO) {
		} catch (ClassNotFoundException e) {
		}
		return result;
	}

	public static void writeToTextFile(String string, ArrayList<Car> theCars) {
		try {
			Formatter f = new Formatter(new File(string));
			for (Car c : theCars) {

				f.format("%s,%s,%f%n", c.getPlateNo(), c.getMake(), c.getPrice());
			}
			f.close();
		} catch (FileNotFoundException e) {
		}
	}

	public static ArrayList<Car> readFromTextFile(String string) {
		ArrayList<Car> result = new ArrayList<>();
		File f1 = new File(string);
		String plateNo;
		String make;
		double price;
		try {
			Scanner s = new Scanner(f1);
			while(s.hasNext()) {
				String[] words=s.nextLine().split(",");
				plateNo=words[0];
				make=words[1];
				price=Double.parseDouble(words[2]);
				result.add(new Car(plateNo,make,price));
				
			}
			s.close();
		} catch (FileNotFoundException e) {
		}
		return result;
	}
}
