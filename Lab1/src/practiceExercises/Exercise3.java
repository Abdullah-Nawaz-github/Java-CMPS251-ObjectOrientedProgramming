package practiceExercises;

/*Write a Java application that reads three integer numbers. Calculate the sum and average 
 * for these numbers. Display the three numbers and their sum and average.
 */
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter first integer number = ");
		int firstInteger = cin.nextInt();
		System.out.print("Enter second integer number = ");
		int secondInteger = cin.nextInt();
		System.out.print("Enter third integer number = ");
		int thirdInteger = cin.nextInt();
		cin.close();

		int sum = firstInteger + secondInteger + thirdInteger;
		var average = (double) sum / 3;
		System.out.println("the sum of these integers is " + sum);
		System.out.printf("the average of these integers is %.2f", average);
	}
}
