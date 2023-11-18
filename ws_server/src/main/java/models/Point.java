package models;

public class Point {
	public Point() {
	}

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	private float x;
	private float y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
