
public class Owner {
	private String id;
	private String name;
	public Owner() { }
	public Owner(String name) {
		setName(name);
	}
	public void copy(Owner owner2) {
		owner2.setId(id);
		owner2.setName(name);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
