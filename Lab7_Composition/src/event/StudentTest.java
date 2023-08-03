package event;

import java.util.ArrayList;
import java.util.Scanner;
import event.*;

public class StudentTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day, month, year;
		String name, title;
		System.out.print("Enter the student name: ");
		name = input.nextLine();
		System.out.print("Enter the student's birth date (dd/mm/yy): ");
		input.useDelimiter("\\D"); // use "/" as delimiter (\\D means any nondigit)
		day = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();
		input.reset(); // reset the delimiter to its default.
		ArrayList<Event> a1=new ArrayList<>();
		Student student = new Student();
		System.out.println("Entering events...\n");
		do {
			input.nextLine(); // skips the new line character.
			System.out.print("Enter a title (or exit): ");
			title = input.nextLine();
			if (title.equalsIgnoreCase("exit"))
				break;
			System.out.print("Enter event date (dd/mm/yy): ");
			input.useDelimiter("\\D"); // use "/" as delimiter
			day = input.nextInt();
			month = input.nextInt();
			year = input.nextInt();
			input.reset(); // reset the delimiter to its default.
			Event event = new Event(title, new Date(day, month, year));
			student.addEvent(event);
		} while (true); // Repeat until the user enters "exit"
		System.out.print(student);
		input.close();
	}
}