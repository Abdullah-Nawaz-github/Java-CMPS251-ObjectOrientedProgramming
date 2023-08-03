package exercise6;

/* Song.java is a class for maintaining basic information about a song.
* Created and Modified by William Mullally */
public class Song {
	private String title;
	private String artist;
	private int duration;

//Constructors
	public Song(String songTitle, int songDuration) {
		title = songTitle;
		duration = songDuration;
		artist = null;
	}

	public Song(String songTitle, int songDuration, String songArtist) {
		title = songTitle;
		duration = songDuration;
		artist = songArtist;
	}

//Accessors
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

public int getDuration() {
return duration;

}

	public void setArtist(String songArtist) {
		artist = songArtist;
	}

//toString
	public String toString() {
		return String.format("Song: %s by %s of duration (mins) %d\n ", title, artist, duration);
	}
}