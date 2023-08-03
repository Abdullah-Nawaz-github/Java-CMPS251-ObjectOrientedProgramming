package event;

import java.util.*;

public class GradeBookTest {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");

		int[] grade151 = { 90, 50, 70, 80, 10, 90, 50, 70, 80, 95, 90, 55, 75, 85, 10 };
		int[] grade102 = { 90, 95, 30, 55, 75, 85, 10, 60, 50, 70, 20, 10, 90, 50, 10, };
		GradeBook gradeBook1 = new GradeBook("Programming Concepts", grade151);
		GradeBook gradeBook2 = new GradeBook("Calculus 2", grade102);
		display(gradeBook1);
		display(gradeBook2);
		System.out.println("----------------------------------------");
		System.out.println("Minimum Grades: " + gradeBook1.minimum());
		System.out.println("Maximum Grades: " + gradeBook1.maximum());
		System.out.printf("Average Grades: %.1f", gradeBook1.average());
		System.out.println("\n----------------------------------------");


		ArrayList<GradeBook> gradeBook = new ArrayList<>();
		gradeBook.add(gradeBook1);
		gradeBook.add(gradeBook2);
	}

	/*
	 * Write method to display course title and all grade for this course
	 */
	public static void display(GradeBook g) {
		System.out.println("Title = " + g.getTitle() + "\nGrades = " + Arrays.toString(g.getGrades()) + "\n");
	}

}
