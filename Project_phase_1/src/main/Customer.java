package main;


/**
 * @author Abdullah Nawaz
 * @version 1.0
 * @date 10/30/2022
 */
public class Customer extends Member {
	/**
	 * discount given to customer
	 */
	private double discount;
	/**
	 * type of memberShip (daily,Monthly,Yearly)
	 */
	private Type memberShipType;

	/**
	 * Default Constructor
	 */
	public Customer() {
	}

	/**
	 * @param memberId       Id of the club member
	 * @param name           Name of the club member
	 * @param mobileNo       Mobile number of the club member
	 * @param nationality    Nationality of the club member
	 * @param gender         Gender of the club member
	 * @param discount       discount given to customer based on membership type
	 * @param memberShipType type of memberShip (daily,Monthly,Yearly)
	 */
	public Customer(int memberId, String name, String mobileNo, String nationality, String gender,
			Type memberShipType) {
		super(memberId, name, mobileNo, nationality, gender);
		this.setMemberShipType(memberShipType);
		this.setDiscount(getDiscount());

	}

	/**
	 * @return discount discount given to customer based in membership type
	 */
	public double getDiscount() {
		if (memberShipType == Type.Monthly) {
			return 10.0;
		} else if (memberShipType == Type.Yearly) {
			return 20.0;
		} else {
			return 0.0;
		}
	}

	/**
	 * @param discount discount given to customer
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * @return memberShipType type of memberShip (daily,Monthly,Yearly)
	 */
	public Type getMemberShipType() {
		return memberShipType;
	}

	/**
	 * @param memberShipType type of memberShip (daily,Monthly,Yearly)
	 */
	public void setMemberShipType(Type memberShipType) {
		this.memberShipType = memberShipType;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		return super.toString() + "\n\tdiscount : " + discount + "\n\tmemberShipType : " + memberShipType;
	}

}
