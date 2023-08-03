package application.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.format.*;

/**
 * Session class to manage session info
 * 
 * @author Muhammad Ahmed Yaqoob 201802799
 * @date 11-Nov-2022
 * @Version 1.0
 */

@SuppressWarnings("serial")
public class Session implements Serializable{
	/**
	 * Id of this session
	 */
	private int sessionId;
	/**
	 * name of this session
	 */
	private String name;
	/**
	 * Coach incharge of this session
	 */
	private Coach coach;
	/**
	 * Start date of this session
	 */
	private LocalDate startDate;
	/**
	 * End date of this session
	 */
	private LocalDate endDate;
	/**
	 * Start time of this session
	 */
	private LocalTime startTime;
	/**
	 * End time of this session
	 */
	private LocalTime endTime;
	/**
	 * Price for this session
	 */
	private double price;
	/**
	 * ArrayList of Customer objects taking this session
	 */
	private ArrayList<Customer> customers;

	
	/**
	 * @param session   Id of this session
	 * @param name      name of this session
	 * @param coach     Coach incharge of this session
	 * @param startDate Start date of this session
	 * @param endDate   End date of this session
	 * @param startTime Start time of this session
	 * @param endTime   End time of this session
	 * @param price     Price for this session
	 * @param customers ArrayList of Customer objects taking this session
	 */
	public Session(int sessionId, String name, Coach coach, LocalDate startDate, LocalDate endDate,
			LocalTime startTime, LocalTime endTime, double price, ArrayList<Customer> customers) {
		this.setSessionId(sessionId);
		this.setName(name);
		this.setCoach(coach);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setStartTime(startTime);
		this.setEndTime(endTime);
		this.setPrice(price);
		this.setCustomers(customers);
	}

	public Session() {
		customers = new ArrayList<Customer>();
	}

	/**
	 * Register customer into session by adding into customers arraylist
	 * 
	 * @param customer new customer need to be added
	 */
	public void registerCustomer(Customer customer) {

		if (customer instanceof Customer)
			customers.add(customer);

	}

	/**
	 * unregister customer from session by deleter the customer from arraylist
	 * 
	 * @param customerID id of customer going to be unregistered
	 */
	public void unregisterCustomer(int customerID) {
		
		for (Customer customer : customers) {
			if (customer.getMemberId() == customerID)
				customers.remove(customer);
		}
	}

	/**
	 * @return String name of this session
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name String name of this session
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Coach coach assigned to this session
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * @param Coach coach assigned to this session
	 */
	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	/**
	 * @return LocalDate start date of this session
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param LocalDate start date of this session
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return LocalDate end date of this session
	 */

	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param LocalDate end date of this session
	 */

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return LocalDateTime start time of this session
	 */
	public LocalTime getStartTime() {
		return startTime;
	}

	/**
	 * @param LocalDateTime start time of this session
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return LocalDateTime end time of this session
	 */
	public LocalTime getEndTime() {
		return endTime;
	}

	/**
	 * @param LocalDateTime end time of this session
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return Double price of this session
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param Double price of this session
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return ArrayList<Customer>
	 */
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers ArrayList of Customer objects taking this session
	 */
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * @return ArrayList of Customer objects taking this session
	 */
	public int getSessionId() {
		return sessionId;
	}

	/**
	 * @param int sessionId of this session
	 */
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return String with values of instance fields in csv format
	 */
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedDateTime1 = startTime.format(formatter);
		String formattedDateTime2 = endTime.format(formatter);
		String customersFormatted = "";
		for (Customer c : customers) {
			customersFormatted += "\n" + c + "\n";
		}
		return "\tsessionId : " + sessionId + "\n\tname : " + name + "\n\n\tcoach : \n" + coach.toString()
				+ "\n\n\tstartDate : " + startDate + "\n\tendDate : " + endDate + "\n\tstartTime : "
				+ formattedDateTime1 + "\n\tendTime : " + formattedDateTime2 + "\n\tprice : " + price
				+ "\n\n\tcustomers : \n" + customersFormatted;
	}

}