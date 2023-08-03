package Exercise5;

public class Tester {

	public Tester() {
		Point p1=new Point(0,0);
		Point p2=new Point(100,50);
		Rectangle r1=new Rectangle(p1,p2);
		System.out.println(r1.toString()+"\n");
		
		Point p3=new Point(0,0);
		Point p4=new Point(300,200);
		Rectangle r2=new Rectangle(p3,p4);
		System.out.println(r2.toString()+"\n");
		
		if(r1.compareTo(r2)==1) {
			System.out.println("r1 is bigger than r2");
		} else if (r1.compareTo(r2)==-1) {
			System.out.println("r1 is smaller than r2");

		}


	}

	public static void main(String[] args) {
		new Tester();

	}

}
