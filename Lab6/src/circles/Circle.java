package circles;

public class Circle {
	private double radius;
	
	public Circle() {
		radius=1;
	}
	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius>=0 && radius<20) {
			this.radius=radius;
		}else {
			this.radius=1;
		}
		
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public double area() {
		return 2*Math.PI*Math.pow(radius, 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void enlarge(double scaleFactor) {
		if (scaleFactor>1) {
			setRadius(getRadius()*scaleFactor);
		}
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
