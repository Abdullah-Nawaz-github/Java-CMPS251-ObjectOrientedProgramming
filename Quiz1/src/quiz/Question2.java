package quiz;
import java.util.Scanner;

public class Question2 {

	public Question2() {
		double a=0;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the side: ");
		a = kb.nextDouble();
		kb.close();
		double Area=Math.pow(a, 2);
		System.out.printf("The square are is: %.2f", Area);

	}

	public static void main(String[] args) {
		new Question2();

	}

}
