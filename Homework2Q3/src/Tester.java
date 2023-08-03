
public class Tester {

	public Tester() {
		MusicAlbum m1=new MusicAlbum("Classics","123-000-233-233",66.0);
		m1.addSong(new Song("Ansak?","Um Kulthom",34));
		m1.addSong(new Song("Shadi","Fairooz",7));
		m1.addSong(new Song("Ams Intahena","Fairooz",8));
		System.out.println(m1);
	}

	public static void main(String[] args) {
		new Tester();
	}

}
