import java.util.Scanner;

public class Exercise5b {

	public Exercise5b() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter month as an integer = ");
		String monthStr = kb.next();
		int monthInt = 0;
		switch (monthStr) {
		case "January":
			monthInt = 1;
			break;
		case "Febuary":
			monthInt = 2;
			break;
		case "March":
			monthInt = 3;
			break;
		case "April":
			monthInt = 4;
			break;
		case "May":
			monthInt = 5;
			break;
		case "June":
			monthInt = 6;
			break;
		case "July":
			monthInt = 7;
			break;
		case "August":
			monthInt = 8;
			break;
		case "September":
			monthInt = 9;
			break;
		case "October":
			monthInt = 10;
			break;
		case "November":
			monthInt = 11;
			break;
		case "December":
			monthInt = 	12;
			break;
		}
		System.out.println(monthInt);
	}

	public static void main(String[] args) {
		new Exercise5b();

	}

}
