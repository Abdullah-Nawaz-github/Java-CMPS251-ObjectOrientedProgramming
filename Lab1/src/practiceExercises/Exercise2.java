package practiceExercises;

import java.util.Scanner;

public class Exercise2 {

	public Exercise2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter an integer = ");
		int a = cin.nextInt();
		System.out.print("Enter a float = ");
		float b = cin.nextFloat();
		System.out.print("Enter a double = ");
		double c = cin.nextDouble();
		System.out.print("Enter a string = ");
		String d = cin.next();
		var sum = a + b + c + d;
		System.out.println("sum = " + sum);
		cin.close();

	}

}
