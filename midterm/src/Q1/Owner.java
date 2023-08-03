package Q1;

public class Owner {
	private String id;
	private String name;

	public Owner(String name) {
		this.name=name;
	}
	
	public void setId(String id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "[id: " + id + ", name: " + name + "]";
	}

	

}
