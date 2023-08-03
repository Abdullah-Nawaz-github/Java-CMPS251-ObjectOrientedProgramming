public class PersonTest {
	public static void main(String[] args) {
		Person p;//= new Person();
		p.setId(1);
		p.setName("Ali");
		System.out.printf("Person ID: %d, Name: %s\n", p.getId(), p.getName());
	}
}

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
