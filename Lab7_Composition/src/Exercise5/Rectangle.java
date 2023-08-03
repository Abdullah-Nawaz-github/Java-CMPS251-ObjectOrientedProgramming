package Exercise5;

public class Rectangle {

	// dont need to initialize over here
	private Point topLeftCorner;
	private Point bottomRightCorner;
	private String color;
	private boolean isFilled;

	public Rectangle() {
		topLeftCorner = new Point();
		bottomRightCorner = new Point();
		color = null;
		isFilled = false;
	}
	
	public Rectangle(Point topLeftCorner,Point bottomRightCorner) {
		this();
		this.setBottomRightCorner(bottomRightCorner);
		this.setTopLeftCorner(topLeftCorner);
	}

	public Point getTopLeftCorner() {
		return topLeftCorner;
	}

	public void setTopLeftCorner(Point topLeftCorner) {
		this.topLeftCorner = topLeftCorner;
	}

	public Point getBottomRightCorner() {
		return bottomRightCorner;
	}

	public void setBottomRightCorner(Point bottomRightCorner) {
		this.bottomRightCorner = bottomRightCorner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public double getWidth() {
		return Math.abs(bottomRightCorner.getX() - topLeftCorner.getX());

	}

	public double getHeight() {
		return Math.abs(topLeftCorner.getY() - bottomRightCorner.getY());

	}

	public boolean isPortrait() {
		if (getWidth() < getHeight()) {
			return true;
		}
		return false;
	}

	public double getArea() {
		return getWidth() * getHeight();
	}
	
	public int compareTo(Rectangle other) {
		if (getArea()>other.getArea()) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		String orientation=isPortrait()?"Portrait":"Landscape";
		return String.format("Top Left Corner = %s \nBotoom Right Corner = %s\nArea = %.2f\n%s", topLeftCorner.toString(),bottomRightCorner.toString(),getArea(),orientation);
	}

	public static void main(String[] args) {

	}

}
