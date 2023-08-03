
//Write a Java program and compute the sum of the digits of an integer. 

import java.util.Scanner;

public class Exercise5digits {

	public Exercise5digits() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an integer = ");
		int number = kb.nextInt();
		kb.close();

		int digit1 = 0;
		int digit2 = 0;
		int numberOfDigits = 0;
		int z = number;
		int sum = 0;
		while (z != 0) { // get digits this way
			numberOfDigits++;
			sum += (z % 10);
			z = z / 10;
		}
		for (int i = 0; i < numberOfDigits; i++) {

		}
		System.out.println("number of digits = " + numberOfDigits);
		System.out.println("sum of digits = " + sum);

	}

	public static void main(String[] args) {
		new Exercise5digits();

	}

}
