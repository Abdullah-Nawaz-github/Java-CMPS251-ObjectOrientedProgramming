package Q1;

public class Vehicle {
	private int plateNo;
	private Owner owner;

	public Vehicle() {
	}
	
	public Vehicle(int plateNo) {
		this.plateNo=plateNo;
	}
	
	public Vehicle(Owner owner) {
		this.owner=owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner=owner;
	}
	public Owner getOwner() {
		return owner;
	}
	public int getPlateNo() {
		return plateNo;
	}

	public void copy(Vehicle v2) {
		owner=v2.getOwner();
		plateNo=v2.getPlateNo();
		
	}

	@Override
	public String toString() {
		return "[plateNo: " + plateNo + ", owner: " + owner + "]";
	}

}
