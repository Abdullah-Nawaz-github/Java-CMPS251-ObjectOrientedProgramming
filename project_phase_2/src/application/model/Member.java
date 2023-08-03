package application.model;

/**
 * 
 * @author Abdullah Nawaz 202108536
 * @version 1.0
 * @date 10/30/2022
 *
 */
import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Member implements Serializable {
// abstract class
	/**
	 * Id of the club member
	 */
	private int memberId;
	/**
	 * Name of the club member
	 */
	private String name;
	/**
	 * Mobile number of the club member
	 */
	private String mobileNo;
	/**
	 * Nationality of the club member
	 */
	private String nationality;
	/**
	 * Gender of the club member
	 */

	private String gender;

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * @param memberId    Id of the club member
	 * @param name        Name of the club member
	 * @param mobileNo    Mobile number of the club member
	 * @param nationality Nationality of the club member
	 * @param gender      Gender of the club member
	 */
	protected Member(int memberId, String name, String mobileNo, String nationality, String gender) {
		this.setMemberId(memberId);
		this.setName(name);
		this.setMobileNo(mobileNo);
		this.setNationality(nationality);
		this.setGender(gender);
	}

	/**
	 * @return memberId Id of the club member
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId Id of the club member
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * 
	 * @return name Name of the club member
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name Name of the club member
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return mobileNo Mobile number of the club member
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo Mobile number of the club member
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return nationality Nationality of the club member
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality Nationality of the club member
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return gender Gender of the club member
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender Gender of the club member
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
//		return "\tmemberId : " + memberId + "\n\tname : " + name + "\n\tmobileNo : " + mobileNo + "\n\tnationality : "
//				+ nationality + "\n\tgender : " + gender;
		return name ;
	}
}
