package exercise6;

public class Tester {

	public Tester() {
		Song s1 = new Song("ieow", 34, "Hamid");
		Song s2 = new Song("JIfoiw", 83, "John");
		Song s3 = new Song("Kusjfhoieta", 31, "Hamid");
		CDImage c1 = new CDImage("cd1", s1, s2, s3);
		System.out.println(c1.toString());
		System.out.println(c1.CDTime());

	}

	public static void main(String[] args) {
		new Tester();
	}

}
