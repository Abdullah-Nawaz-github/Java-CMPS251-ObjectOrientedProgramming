
//Y=1/2+3/4+5/6+...+n/(n+1)! n is an odd number entered by user.
import java.util.Scanner;

public class Exercise2b {

	public Exercise2b() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter odd number = ");
		double n = kb.nextDouble();
		double Y = 0;
		for (double i = 1; i <= n; i = i + 2) { // start by 1 and add 2 to keep it odd

			double denom = i + 1;
			double factorial = 1; // calculate factorial
			for (int j = 1; j <= denom; j++) {
				factorial = factorial * j; 
			}

			Y = Y + (i / factorial);

		}
		System.out.printf("Y = %.3f", Y);
		kb.close();

	}

	public static void main(String[] args) {
		new Exercise2b();

	}

}
