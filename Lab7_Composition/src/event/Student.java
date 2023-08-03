package event;

import java.util.ArrayList;

import Exercise1.Date;

public class Student {
	//a student name, birth date and a list
	//of important events.
	private String name;
	private Date birthDate;
	private ArrayList<Event> events=new ArrayList<>();

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, Date date, ArrayList<Event> events) {
		super();
		this.name = name;
		this.birthDate = date;
		this.events = events;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public ArrayList<Event> getEvents() {
		return events;
	}


	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
//	Write an addEvent method that adds an
//	event to the list of events. It should only add
//	the event if it is not null.
	public void addEvent(Event event) {
		if(event!=null) {
			events.add(event);
		}
	}
//	4. Add a getEvent() method that searches the
//	events list for an event with a title equal to the
//	parameter value.
	public Event getEvent(String title) {
		for (Event e:events) {
			if (e.getTitle().equalsIgnoreCase(title)) {
				return e;
			}
		}
		return null;	
	}
	//Add an overloaded getEvent() method that returns a list of all the Events in a given Month that is
	//passed as a parameter.
	public Event getEvent(String title,int Month) {
		for (Event e:events) {
			if (e.getTitle().equalsIgnoreCase(title) && e.getDate().getMonth()==Month) {
				return e;
			}
		}
		return null;	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birthDate=" + birthDate + ", events=" + events + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
