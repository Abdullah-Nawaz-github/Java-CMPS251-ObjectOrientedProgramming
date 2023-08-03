
public class Exercise3 {

	public Exercise3() {
		int sum=0;
		for (int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.printf("The sum of all numbers from 1 to 100 is -- %d.",sum);
	}

	public static void main(String[] args) {
		new Exercise3();
	}

}