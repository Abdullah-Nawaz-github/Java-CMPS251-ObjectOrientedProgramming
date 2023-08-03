package event;

import java.util.Arrays;

public class GradeBook {
	private String title;
	private  int[] grades;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public GradeBook(String title, int[] grades) {
		setTitle(title);
		setGrades(grades);
	}

	public GradeBook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maximum() {
		int max = 0;
			for (int j : grades) {
				if (j > max) {
					max = j;
				}
			}
			return max;
			}
	public int minimum() {
		int min = 101;
			for (int j : grades) {
				if (j < min) {
					min = j;
				}
			}
			return min;
			}
	public double average() {
		double sum = 0;
		int countGrades = 0;
			for (int j : grades) {
				sum += j;
				countGrades++;
			}
			return (sum/countGrades);
		}
	
		
	@Override
	public String toString() {
		return "GradeBook [title=" + title + ", grades=" + Arrays.toString(grades) + "]";
	}

}
