package one;

public class TestApp {

	public TestApp() {
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		// was able to access thee methods from Person class
		e1.setId(123);
		e1.setName("Khaled");
		e1.setNoOfChildren(2);
		
		System.out.println(e1);
		
		Employee emp2=new Employee(124, "Ameen",1);
		
		Student s1=new Student(231,"Abdullah","CSE");
		Student s2=new Student(98289,"Ahmed","SE");
		System.out.println(s2s);
	}

}
