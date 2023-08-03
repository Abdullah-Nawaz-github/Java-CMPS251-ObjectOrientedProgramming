
public class Song {
	private String artist;
	private int duration;
	private String title;
	
	public Song( String title,String artist, int duration) {
		this.setTitle(title);
		this.setArtist(artist);
		this.setDuration(duration);
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Song Title:"+title+"("+duration+")minutes. "+artist;
	}
	
	
	
}
