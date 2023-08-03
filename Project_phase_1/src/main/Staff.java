package main;

import java.time.*;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 10/31/2022
 */
public class Staff extends Member {
	/**
	 * Date the staff person is hired
	 */
	private LocalDate hiredate;
	/**
	 * Salary of the staff person
	 */
	private double salary;

	/**
	 * Default Constructor
	 */
	public Staff() {
	}

	/**
	 * @param memberId    Id of the club member
	 * @param name        Name of the club member
	 * @param mobileNo    Mobile number of the club member
	 * @param nationality Nationality of the club member
	 * @param gender      Gender of the club member
	 * @param hiredate    Date the staff person is hired
	 * @param salary      Salary of the staff person
	 */
	public Staff(int memberId, String name, String mobileNo, String nationality, String gender, LocalDate hiredate,
			double salary) {
		super(memberId, name, mobileNo, nationality, gender);
		this.setHiredate(hiredate);
		this.setSalary(salary);
	}

	/**
	 * @return hiredate Date the staff person is hired
	 */
	public LocalDate getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate Date the staff person is hired
	 */
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * @return salary Salary of the staff person
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary Salary of the staff person
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		return super.toString() + "\n\thiredate : " + hiredate.toString() + "\n\tsalary : " + salary;
	}

}
