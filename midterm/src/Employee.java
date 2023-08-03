
import java.util.ArrayList;

public class Employee {
	private String name;
	private double salary;
	private int employeeId;
	private static int serialNo = 100;
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	public Employee() {
		employeeId = ++serialNo;
		employees.add(this); // add to the ArrayList
	}
	
	/*Code an additional constructor receiving both, 
	 * the name and salary of the employee, and 
	 * makes use of the existing constructor*/
	public Employee(String name, double salary) {
		this();
		setName(name);
		setSalary(salary);
	}
	
	public int increase(int increment, double salary) {
		int count =0;
		for(Employee e : employees) {
			if(e.salary<salary) {
				e.salary += e.salary*increment;
				++count;
			}
		}
		return count;
	}
	public String toString() {
		return String.format("Employee ID: %d,name: %s, salary: %f", employeeId,name,salary);
	}
	/*Notice the static employees list in this class.
	 * Code a static method that increases, by a specified percentage,
	 * the salary of employees whose salary is below a specified value.
	 * this method should return the total number of benefited employees*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
