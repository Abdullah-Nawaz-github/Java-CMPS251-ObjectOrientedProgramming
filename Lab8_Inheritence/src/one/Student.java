package one;

public class Student extends Person{
	private String major;

	public Student(int id,String name,String major) {
		super( id, name);
		this.setMajor(major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString()+String.format("Major : %s", (this.getMajor().equalsIgnoreCase("CSE")?"it is CSe":"it is not CSE"));
	}

	
	

}
