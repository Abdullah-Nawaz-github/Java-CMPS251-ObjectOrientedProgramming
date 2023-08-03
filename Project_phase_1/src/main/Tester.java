package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 * Tester Class for the functionality of Club App.
 * 
 * @author Sarim Toqeer - 202008545 for Club-1
 * @author Abdullah Nawaz - 202108536 for Club-2
 * @version 1.0
 * @date: 12-Nov-22
 */
public class Tester {

	/**
	 * Main method to test functionality of Club App.
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		// create first club
		Club c1 = new Club("Arts Club", "Doha", "artsclub.com", "4138889999:", new ArrayList<Member>(),
				new ArrayList<Session>());
		Administrator c1a1 = new Administrator(11222, "Daniel", "22290199", "Swedan", "Male",
				LocalDate.of(2012, 10, 30), 20000, "IT Admin");
		Administrator c1a2 = new Administrator(11233, "John", "2232131199", "Norway", "Male",
				LocalDate.of(2014, 10, 30), 20000, "Social Media Admin");

		// added admins to club 1
		c1.addMember(c1a2);
		c1.addMember(c1a1);

		// add sessions, coaches, and customers to club 1
		Coach coach1c1 = new Coach(423423, "Linus", "34233342", "American", "Male", LocalDate.of(2009, 9, 30), 10000,
				"Modern Art", 1200);

		LocalDate date11 = LocalDate.of(2014, Month.JANUARY, 1);
		LocalDate date12 = LocalDate.of(2014, Month.APRIL, 4);
		LocalDateTime time11 = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
		LocalDateTime time12 = LocalDateTime.of(2014, Month.APRIL, 1, 10, 13, 30);
		Session session1c1 = new Session(1120, "Intro", coach1c1, date11, date12, time11, time12, 150.0,
				new ArrayList<>());
		c1.addSession(session1c1); // Session-1

		Coach coach2c1 = new Coach(32342, "Ayesha", "9852342", "Qatar", "Female", LocalDate.of(2012, 9, 29), 10000,
				"Art History", 1100);

		LocalDate date21 = LocalDate.of(2014, Month.FEBRUARY, 1);
		LocalDate date22 = LocalDate.of(2014, Month.AUGUST, 4);
		LocalDateTime time21 = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
		LocalDateTime time22 = LocalDateTime.of(2014, Month.FEBRUARY, 1, 10, 13, 30);
		Session session2c1 = new Session(1122, "Summary", coach2c1, date21, date22, time21, time22, 150.0,
				new ArrayList<>());
		c1.addSession(session2c1); // Session-2

		Customer customer1c1 = new Customer(793453, "Ali", "34234234", "India", "Male", Type.Monthly);
		Customer customer2c1 = new Customer(645433, "Faizan", "3428976", "Pakistan", "Male", Type.Daily);
		Customer customer3c1 = new Customer(900463, "Ahmed", "4234242", "Iran", "Male", Type.Yearly);

		c1.addMember(customer3c1);
		c1.addMember(customer2c1);
		c1.addMember(customer1c1);
		session1c1.registerCustomer(customer1c1);
		session1c1.registerCustomer(customer2c1);
		session1c1.registerCustomer(customer3c1);

		//

		// create second club
		Club c2 = new Club("Computing Club", "Dubai", "computingclub.com", "4138880000:", new ArrayList<Member>(),
				new ArrayList<Session>());
		Administrator c2a1 = new Administrator(21222, "Dani", "33290199", "Mexico", "Male", LocalDate.of(2016, 8, 23),
				30000, "IT Admin");
		Administrator c2a2 = new Administrator(21233, "Lewis", "3332131199", "UK", "Male", LocalDate.of(2016, 7, 21),
				30000, "Social Media Admin");

		// added admins to club 2
		c2.addMember(c2a2);
		c2.addMember(c2a1);

		// add sessions, coaches, and customers to club 1
		Coach coach1c2 = new Coach(423423, "Mark", "34238942", "Canada", "Male", LocalDate.of(2015, 9, 29), 12000,
				"Machine Learning", 1100);

		LocalDate date321 = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate date322 = LocalDate.of(2017, Month.APRIL, 4);
		LocalDateTime time321 = LocalDateTime.of(2017, Month.JANUARY, 1, 10, 10, 30);
		LocalDateTime time322 = LocalDateTime.of(2017, Month.APRIL, 1, 10, 13, 30);
		Session session1c2 = new Session(1120, "Intro to Machine Learning", coach1c2, date321, date322, time321,
				time322, 700.0, new ArrayList<>());
		c2.addSession(session1c2); // Session-1

		Coach coach2c2 = new Coach(48294, "Fatima", "423984", "Oman", "Female", LocalDate.of(2015, 9, 29), 14000,
				"Web Development", 900);

		LocalDate date421 = LocalDate.of(2018, Month.FEBRUARY, 1);
		LocalDate date422 = LocalDate.of(2018, Month.AUGUST, 4);
		LocalDateTime time421 = LocalDateTime.of(2018, Month.JANUARY, 1, 10, 10, 30);
		LocalDateTime time422 = LocalDateTime.of(2018, Month.FEBRUARY, 1, 10, 13, 30);
		Session session2c2 = new Session(1122, "Web Development Basics", coach2c2, date421, date422, time421, time422,
				800.0, new ArrayList<>());
		c2.addSession(session2c2); // Session-2

		Customer customer1c2 = new Customer(453453, "Iman", "9534802", "Kuwait", "Female", Type.Monthly);
		Customer customer2c2 = new Customer(99033, "Fahad", "8593452", "Pakistan", "Male", Type.Daily);
		Customer customer3c2 = new Customer(9953, "Kasif", "99423", "India", "Male", Type.Yearly);

		c2.addMember(customer3c2);
		c2.addMember(customer2c2);
		c2.addMember(customer1c2);
		session1c2.registerCustomer(customer1c2);
		session2c2.registerCustomer(customer2c2);
		session2c2.registerCustomer(customer3c2);

		//

		// Display all customers of Club 1
		System.out.println("\n\tCustomers of Club 1 : " + c1.getName());
		int count = 1;
		for (Member m : c1.getMembers()) {
			if (m instanceof Customer) {
				System.out.println(count++ + " -----------------------\n" + m);
			}
		}

		// Display sessions of Club 2
		count = 1;
		System.out.println("\n\tSessions of Club 2 : " + c2.getName());
		for (Session s : c2.getSessions()) {
			System.out.println(count++ + " ----------------------------------------\n" + s);
		}

		// print the total number of members in each club
		System.out.println("---------------------------------------------------");
		System.out.printf("Total number of members in %s : %d", c1.getName(), c1.getMembers().size());
		System.out.printf("%nTotal number of members in %s : %d", c2.getName(), c2.getMembers().size());
		System.out.println("\n---------------------------------------------------");

		// total of each customer in club 1
		double total = 0.0;
		System.out.println("\n\nTotal fees for each customer in Arts Club :");
		for (Member m : c1.getMembers()) {
			if (m instanceof Customer) {
				Customer cm = (Customer) m;
				total = 0.0 - cm.getDiscount(); // remove discount from total
				for (Session s : c1.getSessions()) {
					if (s.getCustomers().contains(cm)) {
						total += s.getPrice();
					}
				}
				System.out.println("\tfees for " + cm.getName() + " (" + cm.getMemberId() + ") :" + total);
			}
		}

		// total of each customer in club 2
		System.out.println("\nTotal fees for each customer in Computing Club :");
		for (Member m : c2.getMembers()) {
			if (m instanceof Customer) {
				Customer cm = (Customer) m;
				total = 0.0 - cm.getDiscount(); // remove discount from total
				for (Session s : c2.getSessions()) {
					if (s.getCustomers().contains(cm)) {
						total += s.getPrice();
					}
				}
				System.out.println("\tfees for " + cm.getName() + " (" + cm.getMemberId() + ") :" + total);
			}
		}
	}
}
