
/*Write a Java application that performs the following:
•	Read the marks of a student in three subjects: math, computer and music (assume all are integer numbers). 
•	Calculate the total mark and the average mark. 
•	Determine the highest and the lowest of the three marks.
•	Display the total mark, the average mark, the smallest mark and the highest mark as shown in the sample output below. 
*/

import java.util.Scanner;

public class Exercise6 {

	public Exercise6() {
		Scanner kb = new Scanner(System.in);
		int math, computer, music, max = 0, min = 0;
		System.out.print("Enter marks in Math = ");
		math = kb.nextInt();
		System.out.print("Enter marks in Computer = ");
		computer = kb.nextInt();
		System.out.print("Enter marks in Music = ");
		music = kb.nextInt();

		int sum = math + computer + music;
		int avg = sum / 3;

		if (math >= computer && math >= music) // use <= or >= so that it works if two values are the same
			max = math;
		if (math <= computer && math <= music)
			min = math;
		if (computer >= math && computer >= music)
			max = computer;
		if (computer <= math && computer <= music)
			min = computer;
		if (music >= math && music >= computer)
			max = music;
		if (music <= math && music <= computer)
			min = music;

		System.out.printf("Highest Mark is %d%n", max);
		System.out.printf("Lowest Mark is %d%n", min);
		System.out.printf("Total Mark is %d%n", sum);
		System.out.printf("Average Mark is %d", avg);

		kb.close();
	}

	public static void main(String[] args) {
		new Exercise6();

	}

}
