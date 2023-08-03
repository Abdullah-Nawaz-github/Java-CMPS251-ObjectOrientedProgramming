
//Write a Java program to swap two variables. 
import java.util.Scanner;

public class Exercise4 {
	public Exercise4() {
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter integer 1 = ");
		int int1=kb.nextInt();
		System.out.print("Enter integer 2 = ");
		int int2=kb.nextInt();
		kb.close();
		
		var temp=int1;
		int1=int2;
		int2=temp;
		System.out.println("Integer 1 is now "+int1);
		System.out.println("Integer 2 is now "+int2);
	}
	public static void main(String[] args) {
		new Exercise4();
	}
}
