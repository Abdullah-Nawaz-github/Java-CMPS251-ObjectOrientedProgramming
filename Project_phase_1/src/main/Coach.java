package main;

import java.time.LocalDate;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 10/31/2022
 */
public class Coach extends Staff {
	/**
	 * Speciality of the Staff member
	 */
	private String speciality;
	/**
	 * amount of overTime worked by the staff member
	 */
	private double overTime;

	/**
	 * Default Constructor
	 */
	public Coach() {
	}

	/**
	 * @param memberId    Id of the club member
	 * @param name        Name of the club member
	 * @param mobileNo    Mobile number of the club member
	 * @param nationality Nationality of the club member
	 * @param gender      Gender of the club member
	 * @param hiredate    Date the staff person is hired
	 * @param salary      Salary of the staff person
	 * @param speciality  Speciality of the Staff member
	 * @param overTime    amount of overTime worked by the staff member
	 */
	public Coach(int memberId, String name, String mobileNo, String nationality, String gender, LocalDate hiredate,
			double salary, String speciality, double overTime) {
		super(memberId, name, mobileNo, nationality, gender, hiredate, salary);
		this.setSpeciality(speciality);
		this.setOverTime(overTime);
	}

	/**
	 * @return speciality Speciality of the Staff member
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality Speciality of the Staff member
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return overTime amount of overTime worked by the staff member
	 */
	public double getOverTime() {
		return overTime;
	}

	/**
	 * @param overTime amount of overTime worked by the staff member
	 */
	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		return super.toString() + "\n\tspeciality : " + speciality + "\n\toverTime : " + overTime;
	}

}