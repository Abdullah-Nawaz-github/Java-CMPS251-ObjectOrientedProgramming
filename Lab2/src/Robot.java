public class Robot {
	int xlocation;
	int ylocation;
	String name;
	static int ccount = 0;

	public Robot(int xxlocation, int yylocation, String nname) {
		xlocation = xxlocation;
		ylocation = yylocation;
		name = nname;
		ccount++;
	}
}
