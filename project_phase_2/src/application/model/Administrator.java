package application.model;

import java.time.LocalDate;

/**
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 10/31/2022
 */
public class Administrator extends Staff {
	/**
	 * jobtitle of Administrator
	 */
	private String jobTitle;

	public Administrator() {

	}

	/**
	 * @param memberId    Id of the club member
	 * @param name        Name of the club member
	 * @param mobileNo    Mobile number of the club member
	 * @param nationality Nationality of the club member
	 * @param gender      Gender of the club member
	 * @param hiredate    Date the staff person is hired
	 * @param salary      Salary of the staff person
	 * @param jobTitle    jobtitle of Administrator
	 */
	public Administrator(int memberId, String name, String mobileNo, String nationality, String gender,
			LocalDate hiredate, double salary, String jobTitle) {
		super(memberId, name, mobileNo, nationality, gender, hiredate, salary);
		this.setJobTitle(jobTitle);
	}

	/**
	 * @return jobTitle jobtitle of Administrator
	 */
	public String getJobTitle() {
		System.out.println("Hello");
		return jobTitle;
	}

	/**
	 * @param jobTitle jobtitle of Administrator
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		return "[jobTitle: " + jobTitle + "]";
	}

}