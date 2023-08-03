
public class Cube extends ThreeDimensionalShape {

	public Cube(int x, int y, int side) {
		super(x, y, side, side, side);
	}

	public void setSide(int side) {
		setDimension1(side);
		setDimension2(side);
		setDimension3(side);
	}

	public int getSide() {
		return getDimension1();
	}

	@Override
	public String getName() {
		return "Cube";
	}

	public int getArea() {
		return (6 * (getDimension1()) * (getDimension1()));
	}

	public int getVolume() {
		return ((getDimension1()) * (getDimension2()) * (getDimension3()));
	}

	public String toString() {
		return getX() + "," + getY() + "," + getDimension1();
	}

}