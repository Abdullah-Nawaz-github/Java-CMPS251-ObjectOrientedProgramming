
public class Vehicle {
	private int plateNo;
	private Owner owner;
	public Vehicle(int plateNo) {
		setPlateNo(plateNo);
	}
	public Vehicle() {	}
	public int getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(int plateNo) {
		this.plateNo = plateNo;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void copy(Vehicle v2) {
		v2.setPlateNo(plateNo);
		this.owner.copy(v2.getOwner());	
	}
}
