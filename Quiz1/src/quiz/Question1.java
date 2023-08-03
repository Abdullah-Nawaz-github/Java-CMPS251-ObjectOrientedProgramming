package quiz;

import java.util.Scanner;

public class Question1 {

	public Question1() {
		double numberOne;
		double numberTwo;
		double numberThree;
		Scanner kb = new Scanner(System.in);
		System.out.print("Input first number: ");
		numberOne = kb.nextDouble();
		System.out.print("Input second number: ");
		numberTwo = kb.nextDouble();
		System.out.print("Input third number: ");
		numberThree = kb.nextDouble();
		kb.close();
		double max = Math.max(numberOne, Math.max(numberTwo, numberThree));
		double min = Math.min(numberOne, Math.max(numberTwo, numberThree));
		;
		System.out.println("The highest number is " + max);

		System.out.println("The lowest number is " + min);
		if (max % 3 == 0 && min % 3 == 0) {
			System.out.println("Both numbers are divisible by 3");
		} else {
			System.out.println("Both numbers are NOT divisible by 3");
		}

	}

	public static void main(String[] args) {
		new Question1();

	}

}
