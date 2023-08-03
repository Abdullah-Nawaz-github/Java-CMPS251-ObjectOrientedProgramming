
public class DigitalBook extends Book {
	private int size;
	public DigitalBook(String title, int yearOfPublication, String author,int size) {
		super(title, yearOfPublication, author);
		this.setSize(size);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return super.toString()+"DigitalBook [size=" + size + "]";
	}
	
	

	

}
