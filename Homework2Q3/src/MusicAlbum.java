import java.util.*;

public class MusicAlbum extends MediaItem {
	private ArrayList<Song> albumSongs=new ArrayList<>();

	public MusicAlbum(String title, String ISBN, double price) {
		super(title, ISBN, price);
	}

	public ArrayList<Song> getAlbumSongs() {
		return albumSongs;
	}

	public void setAlbumSongs(ArrayList<Song> albumSongs) {
		this.albumSongs = albumSongs;
	}

	public void addSong(Song song) {
		if(!song.equals(null)) {
			albumSongs.add(song);
		}
	}

	public int getSongCount() {
		return albumSongs.size();
	}

	public int getAverageSongTime() {
		int totalSongTime = 0;
		for (Song s : albumSongs) {
			totalSongTime += s.getDuration();
		}
		return (totalSongTime / albumSongs.size());
	}
	
	public int getMinutes() {
		int minutes = 0;
		for (Song s : albumSongs) {
			minutes += s.getDuration();
		}
		return minutes;
	}
	
	public Song getLongestSong() {
		Song longestSong=null;
		int max=0;
		for (Song s : albumSongs) {
			if(s.getDuration()>=max) {
				max=s.getDuration();
				longestSong=s;
			}
		}
		return longestSong;
		
	}

	@Override
	public String toString() {
		String outputArray="\nSongs("+albumSongs.size()+"):";
		for (Song s : albumSongs) {
			outputArray+="\n\t\t\t"+s;
		}
		return "Music Album "+super.toString()+"Time: "+getMinutes()+outputArray;
	}

	
	


	

}
