package one;

public class Employee extends Person{
	private int noOfChildren;

	public Employee() {
	}
	
	// need default constructor in the parent class
	public Employee(int noOfChildren) {
		super();
		this.noOfChildren = noOfChildren;
	}
	
	public Employee(int id,String name,int noOfChildren ) {
		super(id,name);
		this.noOfChildren = noOfChildren;
	} 


	public int getNoOfChildren() {
		return noOfChildren;
	}


	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}




	@Override
	public String toString() {
		return "Employee [noOfChildren=" + this.getNoOfChildren() + "]"+super.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
