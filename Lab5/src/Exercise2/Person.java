package Exercise2;

/**
 * @author Abdullah 202108536
 * @version 1.0
 * 
 */
public class Person {
	/**
	 * The first name of the person
	 */
	private String firstName;
	/**
	 * The last name of the person
	 */
	private String lastName;
	/**
	 * The age name of the person
	 */
	private int age;

	/**
	 * @param firstName The first name of the person
	 * @param lastName  The last name of the person
	 * @param age       The age name of the person
	 */
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	/**
	 * This method sets the age field for a Person object. It ensures that the <br>
	 * argumentis positive. If it is negative, the method does nothing.
	 * 
	 * @param age An integer value that representsthe age in years.
	 */
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}

	}

	public static void main(String[] args) {

	}
}

