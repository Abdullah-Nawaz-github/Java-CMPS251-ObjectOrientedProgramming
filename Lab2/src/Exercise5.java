
//•	Write an application that prints the month of the year depending on the value of an integer variable month.
import java.util.Scanner;

public class Exercise5 {

	public Exercise5() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter month as an integer = ");
		int monthInt = kb.nextInt();
		String monthStr = null;
		switch (monthInt) {
		case 1:
			monthStr = "January";
			break;
		case 2:
			monthStr = "Febuary";
			break;
		case 3:
			monthStr = "March";
			break;
		case 4:
			monthStr = "April";
			break;
		case 5:
			monthStr = "May";
			break;
		case 6:
			monthStr = "June";
			break;
		case 7:
			monthStr = "July";
			break;
		case 8:
			monthStr = "August";
			break;
		case 9:
			monthStr = "September";
			break;
		case 10:
			monthStr = "October";
			break;
		case 11:
			monthStr = "November";
			break;
		case 12:
			monthStr = "December";
			break;
		}
		System.out.println(monthStr);
	}

	public static void main(String[] args) {
		new Exercise5();

	}

}
