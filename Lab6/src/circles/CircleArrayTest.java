package circles;

import java.util.Random;

import java.util.Scanner;

public class CircleArrayTest {

	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();

		Circle circles[] = new Circle[size];
		for (int i = 0; i < circles.length; i++) {
			try {
				System.out.println("Enter the radius for circle " + (i + 1));
				double radius = input.nextDouble();
				circles[i] = new Circle(radius);
			} catch (Exception e) {
				System.out.println("radius should be double");
				circles[i] = new Circle(0);
			}
		}

		System.out.println("Circles List:");
		input.close();

		// write code to print the radius, area and circumference
		// for all the circles, each on a line.
		int count = 1;
		for (Circle c : circles) {
			System.out.println("Radius of circle " + count + " is " + c.getRadius());
			System.out.println("Area of circle " + count + " is " + c.area());
			System.out.println("Circumference of circle " + count + " is " + c.circumference() + "\n");
			count++;
		}
		System.out.println(findLargest(circles).toString());

		System.out.println("Average Area before " + getAverageArea(circles));

		scaleUp(circles);
		System.out.println("Average Area after scaling up " + getAverageArea(circles) + "\n");
		int count2 = 1;
		for (Circle c : circles) {
			System.out.println("Radius of circle " + count2 + " is " + c.getRadius());
			System.out.println("Area of circle " + count2 + " is " + c.area());
			System.out.println("Circumference of circle " + count2 + " is " + c.circumference() + "\n");
			count++;
		}

	}

	public static Circle findLargest(Circle circles[]) {
		double max = 0;
		Circle maxCircle = new Circle(0);
		for (Circle c : circles) {
			if (c.getRadius() > max) {
				max = c.getRadius();
				maxCircle = c;
			}
		}
		return maxCircle;
	}

	// In the CircleArrayTest class, add a static method called getAverageArea
	// (Circle circles[]) that
	// returns the average area of all circles. Use the enhanced for loop.
	public static double getAverageArea(Circle[] circles) {
		double sum = 0;
		for (Circle c : circles) {
			sum += c.area();
		}
		return (sum / circles.length);
	}

//	Add a static method called scaleUp(Circle circles[]) that enlarges each circle in the circles
//	array using a random number between 2 and 9 inclusive. 
	public static void scaleUp(Circle circles[]) {
		Random random = new Random();
		int randomNum = random.nextInt(8) + 2; // values between 0 to 7. +2 means 2 to 9
		for (int i = 0; i < circles.length; i++) {
			circles[i].enlarge(randomNum);
		}
	}
}