package exercise6;

/**
 * @author Abdullah 202108536
 * @version 1.0
 * 
 */
public class CDImage {
	/**
	 * The title of the CD
	 */
	String cdTitle;
	/**
	 * First Song in the CD
	 */
	Song song1;
	/**
	 * Second Song in the CD
	 */
	Song song2;
	/**
	 * Third Song in the CD
	 */
	Song song3;

	public CDImage() {

	}

	/**
	 * 
	 * @param cdTitle The title of the CD
	 * @param song1   First Song in the CD
	 * @param song2   Second Song in the CD
	 * @param song3   Third Song in the CD
	 */
	public CDImage(String cdTitle, Song song1, Song song2, Song song3) {
		this.cdTitle = cdTitle;
		this.song1 = song1;
		this.song2 = song2;
		this.song3 = song3;
	}

	public String getCdTitle() {
		return cdTitle;
	}

	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}

	public Song getSong1() {
		return song1;
	}

	public void setSong1(Song song1) {
		this.song1 = song1;
	}

	public Song getSong2() {
		return song2;
	}

	public void setSong2(Song song2) {
		this.song2 = song2;
	}

	public Song getSong3() {
		return song3;
	}

	public void setSong3(Song song3) {
		this.song3 = song3;
	}

	/**
	 * This method returns the total duration of all the songs in this CD
	 * 
	 * @return
	 */
	public int CDTime() {
		return song1.getDuration() + song2.getDuration() + song3.getDuration();
	}

	@Override
	public String toString() {
		return String.format("CD Title = %s\n%s\n%s\n%s", cdTitle, song1.toString(), song2.toString(),
				song3.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
