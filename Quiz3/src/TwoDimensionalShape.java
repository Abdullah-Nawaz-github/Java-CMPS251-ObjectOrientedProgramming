
public abstract class TwoDimensionalShape extends Shape {

	int dimension1;
	int dimension2;

	public TwoDimensionalShape(int x, int y, int dimension1, int dimension2) {
		super(x, y);
		this.setDimension1(dimension1);
		this.setDimension2(dimension2);
	}

	public void setDimension1(int dimension1) {
		this.dimension1 = dimension1;
	}

	public int getDimension1() {
		return dimension1;
	}

	public void setDimension2(int dimension2) {
		this.dimension2 = dimension2;
	}

	public int getDimension2() {
		return dimension2;
	}

	public abstract int getArea();

}
