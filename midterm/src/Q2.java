
import java.util.ArrayList;

public class Q2 {

	public Q2() {
		Employee e1 = new Employee("Omran Ibrahim", 14000);
		Employee e2 = new Employee();
		Employee e3 = new Employee("Fatimah Jamal", 12000);
		for(Employee e :Employee.employees) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new Q2();
	}
}
