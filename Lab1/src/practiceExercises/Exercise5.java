package practiceExercises;

public class Exercise5 {

	public static void main(String[] args) {
		int a = 10; 
		double b = 9.85; 
		double c = 10.5; 
		double s = ((a + b + c) / 2); 
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		System.out.printf("The area of this triangle is %.2f.", area); 
	}
}
