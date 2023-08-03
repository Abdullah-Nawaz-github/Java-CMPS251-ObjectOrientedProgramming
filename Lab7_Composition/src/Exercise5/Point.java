package Exercise5;

import java.util.*;

public class Point {
	private int x;
	private int y;

	public Point() {
		// x≤600 and y≤400
		Random secureRandom = new Random();
		x = secureRandom.nextInt(601);
		y = secureRandom.nextInt(401);
	}

	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x <= 600 && x >= 0) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y <= 400 && y >= 0) {
			this.y = y;
		}
		this.y = y;
	}

	public double getDistance(Point aPoint) {
		double distance = Math.sqrt(Math.pow((aPoint.getX() - x),2) + Math.pow((aPoint.getY() - y),2));
		return distance;

	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", x,y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
