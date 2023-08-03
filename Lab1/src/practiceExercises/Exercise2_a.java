package practiceExercises;

import java.util.Scanner;

/*	Write a Java application that reads two strings representing the user’s first name and last name and then 
 * concatenate the two strings in a new string called fullName  */
public class Exercise2_a {

	public static void main(String[] args) {
		System.out.print("Enter your first name ..... ");

		Scanner cin = new Scanner(System.in);
		String firstName = cin.nextLine();	

		System.out.print("Enter your Last name ..... ");
		String lastName = cin.nextLine();
		cin.close();

		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
	}
}
