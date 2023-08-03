
public class Square extends TwoDimensionalShape {

	public Square(int x, int y, int side) {
		super(x, y, side, side);
	}

	public void setSide(int side) {
		setDimension1(side);
		setDimension2(side);
	}

	public int getSide() {
		return getDimension2();
	}

	@Override
	public String getName() {
		return "Square";
	}
	
	@Override
	public int getArea() {
		return (getDimension1() * getDimension1());
	}

	@Override
	public String toString() {
		return getX() + "," + getY() + "," + getDimension1();
	}

}
