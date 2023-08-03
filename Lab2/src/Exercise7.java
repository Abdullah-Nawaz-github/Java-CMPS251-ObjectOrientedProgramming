
/*Write an application that outputs Distance values measured in inches and its equivalent in Centimeters for all Distance
 *  values between 0 and 50 inches in intervals of 2 inches.   The equation to convert inches to centimeters is: 
		centimeters = 2.54*inches
(format your inches values as integers and the centimeters values as double values displaying 2 decimal places
 after the decimal point.)
*/
public class Exercise7 {

	public Exercise7() {
		double cm;
		System.out.println("Inches\tCentimeters");
		for (int inch = 0; inch <= 50; inch=inch+2) {
			cm = (double) 2.54 * inch;
			System.out.printf("%-6d\t%-10.2f%n", inch, cm);
		}
	}

	public static void main(String[] args) {
		new Exercise7();
	}

}
