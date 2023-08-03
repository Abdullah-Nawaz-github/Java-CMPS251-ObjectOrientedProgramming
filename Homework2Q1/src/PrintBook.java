
public class PrintBook extends Book {

	private String publisher;
	private int ISBN;

	public PrintBook(String title, int yearOfPublication, String author, String publisher, int ISBN) {
		super(title, yearOfPublication, author);
		this.setPublisher(publisher);
		this.setISBN(ISBN);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return super.toString()+"PrintBook [publisher=" + publisher + ", ISBN=" + ISBN + "]";
	}

	
	

}
