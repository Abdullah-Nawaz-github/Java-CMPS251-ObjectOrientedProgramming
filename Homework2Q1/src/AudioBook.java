
public class AudioBook extends DigitalBook {
	private int length;
	private String artist;

	public AudioBook(String title, int yearOfPublication, String author, int size, int length, String artist) {
		super(title, yearOfPublication, author, size);
		this.setLength(length);
		this.setArtist(artist);

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return super.toString()+"AudioBook [length=" + length + ", artist=" + artist + "]";
	}
	
	

}
