
public abstract class ThreeDimensionalShape extends Shape {

	int dimension1;
	int dimension2;
	int dimension3;

	public ThreeDimensionalShape(int x, int y, int dimension1, int dimension2, int dimension3) {
		super(x, y);
		this.setDimension1(dimension1);
		this.setDimension2(dimension2);
		this.setDimension3(dimension3);
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

	public void setDimension3(int dimension3) {
		this.dimension3 = dimension3;
	}

	public int getDimension3() {
		return dimension3;
	}

	public abstract int getArea();

	public abstract int getVolume();

}
