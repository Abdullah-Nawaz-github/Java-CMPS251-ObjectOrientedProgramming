package Q1;

public class Q1 {
	public Q1() {
		Vehicle v1 = new Vehicle(1621732); // plateNo
		v1.setOwner(new Owner("Huda Abdullah"));
		v1.getOwner().setId("12400007355");
		Vehicle v2 = new Vehicle(2342424);
		v2.setOwner(new Owner("John"));
		
		// deep copy of v1 saved in v2
		//v1.copy(v2);
		
		System.out.println(v1);
	}

	public static void main(String[] args) {
		new Q1();
	}
}
