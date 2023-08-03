package practiceExercises;

/*  Exercise 6 : Write a Java application to read three numbers representing the percent scores of a student 
 *  in three subjects: Math, Computer, and English, and then compute and display their average.
 *  If the average is less than 60 then print an asterisk ‘i.e. a *’ next to the average.
 *  Test your program once with data that produces an average greater than 60 and once with a set of data that 
 *  produces an average which is less than 60.*/

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("What is the percent score in Math ? ..... ");
		int Math = cin.nextInt(); // prevent user input being bigger than 100
		System.out.print("What is the percent score in Computer ? ..... ");
		int Computer = cin.nextInt();
		System.out.print("What is the percent score in English ? ..... ");
		int English = cin.nextInt();
		int average = ((Math + Computer + English) / 3);
		if (average < 60) {
			System.out.println("The average is == " + average + "*");
		} else {
			System.out.println("The average is == " + average + "%");
		}
		cin.close();
	}
}
