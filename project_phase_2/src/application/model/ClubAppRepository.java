package application.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abdullah Nawaz - 202108536
 * @author Sarim Toqeer - 202008545
 * 
 * @version 1.0
 * @date 01/03/2023
 * 
 *       Class with methods used to read and write Objects into and from data
 *       files
 *
 */
public class ClubAppRepository {

	/**
	 * @return List of type Customer. use ObjectInputStream to read data from
	 *         customers.dat and put them into a List.
	 */
	public static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		ObjectInputStream in;
		System.out.println("Read from Customer file");
		try {
			in = new ObjectInputStream(new FileInputStream("customers.dat"));

			customers = Arrays.asList((Customer[]) in.readObject());
			for (Customer c : customers)
				System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customers;
	}

	/**
	 * @param customers Receives Array of customers and uses ObjectOutputStream to
	 *                  save data in customers.dat.
	 */
	public static void saveCustomers(Customer[] customers) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("customers.dat"));
			System.out.printf("%d customers loaded%n", customers.length);
			for (Customer c : customers)
				System.out.println(c);
			out.writeObject(customers);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return List of type Coach. use ObjectInputStream to read data from
	 *         coaches.dat and put them into a List.
	 */
	public static List<Coach> getCoaches() {
		List<Coach> coaches = new ArrayList<Coach>();
		ObjectInputStream in;
		System.out.println("Read from Coaches file");
		try {
			in = new ObjectInputStream(new FileInputStream("coaches.dat"));

			coaches = Arrays.asList((Coach[]) in.readObject());
			for (Coach coach : coaches)
				System.out.println(coach);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return coaches;
	}

	/**
	 * @param coaches Receives Array of coaches and uses ObjectOutputStream to
	 *                  save data in coaches.dat.
	 */
	public static void saveCoaches(Coach[] coaches) {
		ObjectOutputStream out2;
		try {
			out2 = new ObjectOutputStream(new FileOutputStream("coaches.dat"));
			System.out.printf("%d coaches loaded%n", coaches.length);
			for (Coach c : coaches)
				System.out.println(c);
			out2.writeObject(coaches);
			out2.flush();
			out2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return List of type Administrator. use ObjectInputStream to read data from
	 *         administrators.dat and put them into a List.
	 */
	public static List<Administrator> getAdministrator() {
		List<Administrator> administrators = new ArrayList<Administrator>();
		ObjectInputStream in;
		System.out.println("Read from Administrators file");
		try {
			in = new ObjectInputStream(new FileInputStream("administrators.dat"));

			administrators = Arrays.asList((Administrator[]) in.readObject());
			for (Administrator administrator : administrators)
				System.out.println(administrator);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return administrators;
	}

	/**
	 * @param administrator Receives Array of administrator and uses ObjectOutputStream to
	 *                  save data in administrators.dat.
	 */
	public static void saveAdministrators(Administrator[] administrator) {
		ObjectOutputStream out3;
		try {
			out3 = new ObjectOutputStream(new FileOutputStream("administrators.dat"));
			System.out.printf("%d administrators loaded%n", administrator.length);
			for (Administrator admin : administrator)
				System.out.println(admin);
			out3.writeObject(administrator);
			out3.flush();
			out3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param sessions Receives Array of sessions and uses ObjectOutputStream to
	 *                  save data in sessions.dat.
	 */
	public static void saveSessions(Session[] sessions) {
		ObjectOutputStream out3;
		try {
			out3 = new ObjectOutputStream(new FileOutputStream("sessions.dat"));
			System.out.printf("%d sessions loaded%n", sessions.length);
			for (Session s : sessions)
				System.out.println(s);
			out3.writeObject(sessions);
			out3.flush();
			out3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return List of type Session. use ObjectInputStream to read data from
	 *         sessions.dat and put them into a List.
	 */
	public static List<Session> getSessions() {
		List<Session> sessions = new ArrayList<Session>();
		ObjectInputStream in;
		System.out.println("Read from Sessions file");
		try {
			in = new ObjectInputStream(new FileInputStream("sessions.dat"));

			sessions = Arrays.asList((Session[]) in.readObject());
			for (Session s : sessions)
				System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("no data in file");
		}

		return sessions;
	}

}
