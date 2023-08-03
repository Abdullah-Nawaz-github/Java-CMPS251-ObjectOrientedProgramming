
import java.util.ArrayList;

import Q1.Owner;

public class Registration {
	private ArrayList<Transcript> transcripts = new ArrayList<Transcript>();
	
	public static void main(String[] Args) {
		new Registration();
	}
	public Registration() {
		System.out.println(m1("234",2));
	}

	/*
	 * Q.3 You are inside the Registration class. Write a method m1 that returns a
	 * list of student with a CE major who passed a specified course, giving its
	 * code, and passed a specified number of chs.
	 */
	public ArrayList<Student> m1(String code,int chs){
		ArrayList<Student> result=new ArrayList<>();
		for(Transcript t:transcripts) {
			Student s=t.getStudent();
)
			}
			
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public ArrayList<Student> m1(String courseCode, int minChs) {
//		ArrayList<Student> result = new ArrayList<Student>();
//		Student s;
//		for (Transcript t : transcripts) {
//			s = t.getStudent();
//			if (s.getMajor().equalsIgnoreCase("CE")) {
//				for (TranscriptEntry te : t.getEntries()) {
//					Course c = te.getCourse();
//					if (
//							c.getCourseCode().equals(courseCode) && 
//							te.getGrade() >= 60
//					) {
//						int chs = 0;
//						for (TranscriptEntry te2 : t.getEntries()) {
//							if (te2.getGrade() >= 60) {
//								chs += te2.getCourse().getChs();
//							}
//						}
//						if (chs >= minChs) {
//							result.add(s);
//						}
//					}
//				}
//			}
//		}
//		return result;
//	}

	/*
	 * Write a method that calculates the GPA of student using the formula:
	 * Sum(grade*chs)/sum(chs)
	 */
	public double m2(String id) {
		for (Transcript t : transcripts) {
			if (t.getStudent().getId().equalsIgnoreCase(id)) {
				int sumGrades = 0, sumChs = 0;
				for (TranscriptEntry te : t.getEntries()) {
					int chs = te.getCourse().getChs();
					sumGrades += te.getGrade() * chs;
					sumChs += chs;
				}
				return (double) sumGrades / sumChs;
			}
		}
		return 0;
	}
	/*
	 * Write a method that returns an array having the average, of male, female, and
	 * all students of CS major who took the course Math 102 in Fall 2021.
	 */

	public double[] m3() {
		double[] avr = { 0, 0, 0 };
		int sumMale = 0, sumFemale = 0, sumAll = 0;
		int countMale = 0, countFemale = 0, countAll = 0;
		for (Transcript t : transcripts) {
			Student s = t.getStudent();
			if (s.getMajor().equalsIgnoreCase("CS")) {
				for (TranscriptEntry te : t.getEntries()) {
					if (
							te.getSemester().equals("Fall") && 
							te.getYear() == 2021&& 
							te.getCourse().getCourseCode().equals("Math 102")
					) {
						int grade = te.getGrade();
						sumAll += grade;
						++countAll;
						if (s.getGender() == Gender.Male) {
							sumMale += grade;
							++countMale;
						} else {
							sumFemale += grade;
							++countFemale;
						}
					}
				}
			}
		}
		avr[0] = (double) sumMale / countMale;
		avr[1] = (double) sumFemale / countFemale;
		avr[3] = (double) sumAll / countAll;
		return avr;
	}
}
