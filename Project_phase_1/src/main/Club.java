package main;
import java.util.ArrayList;

/**
 * 
 * @author Sarim Toqeer - 202008545
 * @version 1.0
 * @date: 01-Nov-22
 * 
 */

public class Club {
	/**
	 * Name of the club
	 */
	private String name;
	/**
	 * City of the club
	 */
	private String city;
	/**
	 * Website of the club
	 */
	private String website;
	/**
	 * Phone number of the club
	 */
	private String phone;
	/**
	 * ArrayList of the members of Member class
	 */
	private ArrayList<Member> members = new ArrayList<Member>();
	/**
	 * ArrayList of the sessions of Session class
	 */
	private ArrayList<Session> sessions = new ArrayList<Session>();

	/**
	 * Default Constructor
	 */
	public Club() {
	}

	/**
	 * @param name     Name of the club
	 * @param city     City of the club
	 * @param website  Website of the club
	 * @param phone    Phone number of the club
	 * @param members  ArrayList of the members of Member class
	 * @param sessions ArrayList of the sessions of Session class
	 */
	public Club(String name, String city, String website, String phone, ArrayList<Member> members,
			ArrayList<Session> sessions) {
		this.setName(name);
		this.setCity(city);
		this.setWebsite(website);
		this.setPhone(phone);
		this.setMembers(members);
		this.setSessions(sessions);
	}

	/**
	 * @param member method to add given member in ArrayList of members
	 */
	public void addMember(Member member) {
		if(member instanceof Customer)
			members.add(member);
	}

	/**
	 * @param memberId method to remove specific member from ArrayList of members by
	 *                 given memberID
	 */
	public void removeMember(int memberId) {
		for (Member m : members) {
			if (m.getMemberId() == memberId) {
				members.remove(m);
			}
		}
	}

	/**
	 * @param memberId
	 * @return member from members ArrayList by given memberID
	 */
	public Member findMember(int memberId) {
		for (Member m : members) {
			if (m.getMemberId() == memberId) {
				return m;
			}
		}
		return null;
	}

	/**
	 * @param session method to add given session in ArrayList of sessions
	 */
	public void addSession(Session session) {
		sessions.add(session);
	}

	/**
	 * @param sessionId method to remove specific session from ArrayList of sessions
	 *                  by given sessionID
	 */
	public void removeSession(int sessionId) {
		for (Session s : sessions) {
			if (s.getSessionId() == sessionId) {
				sessions.remove(s);
			}
		}
	}

	/**
	 * @param sessionId
	 * @return session from sessions ArrayList by given sessionID
	 */
	public Session findSession(int sessionId) {
		for (Session s : sessions) {
			if (s.getSessionId() == sessionId) {
				return s;
			}
		}
		return null;
	}

	/**
	 * @return Name of the club
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name Name of the club
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return City of the club
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city City of the club
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return Website of the club
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website Website of the club
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return Phone number of the club
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone Phone number of the club
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return ArrayList of the members of Member class
	 */
	public ArrayList<Member> getMembers() {
		return members;
	}

	/**
	 * @param members ArrayList of the members of Member class
	 */
	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	/**
	 * @return ArrayList of the sessions of Session class
	 */
	public ArrayList<Session> getSessions() {
		return sessions;
	}

	/**
	 * @param sessions ArrayList of the sessions of Session class
	 */
	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}

	/**
	 * String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		return "[name: " + name + ", city: " + city + ", website: " + website + ", phone: " + phone + ", members: "
				+ members + "]";
	}
}