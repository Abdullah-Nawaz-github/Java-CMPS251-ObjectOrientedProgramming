package event;

public class Event {
	private String title;
	private Date date;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}
	

	public Event(String title, Date date) {
		super();
		this.setTitle(title);
		this.setDate(date);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "event [title=" + title + ", date=" + date + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
