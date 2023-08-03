package practiceExercises;

import java.util.Scanner;

//We took the quiz today the question was about basically entering salaries of 5 employees and calculating bonus depending on how much the salary 
//bonus is 10% if salary is lower than 5000. 20% instead
public class Quiz1Exercise {

	public static void main(String[] args) {
		new Quiz1Exercise();

	}

	public Quiz1Exercise() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);	
		}
		
		
		Scanner kb = new Scanner(System.in);
		int salary = 0;
		double bonus = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%nEnter salary of Employee #%d = ", i);
			salary = kb.nextInt();
			if (salary <= 5000) {
				bonus = salary * 0.1;
			} else {
				bonus = salary * 0.2;
			}
			System.out.printf("%nThe bonus for Employee #%d = %.2f", i, bonus);
		}
		kb.close();
	}

}
