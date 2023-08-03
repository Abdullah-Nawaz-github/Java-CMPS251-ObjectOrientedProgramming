
public class MediaItem {
	private int minutes;
	private double price;
	private String ISBN;
	private String title;

	public MediaItem(String title, String ISBN, double price) {
		this.setTitle(title);
		this.setISBN(ISBN);
		this.setPrice(price);
	}

	public MediaItem(String title, String ISBN, double price, int minutes) {
		this(title, ISBN, price);
		this.setMinutes(minutes);

	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return String.format("Title:%s, ISBN:%s, Price:%.1f$. ", getTitle(),getISBN(),getPrice());
	}

	

}
