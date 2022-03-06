package data.java_oop.point;

public class Point_2D {
	// Attributes
	private double x;
	private double y;

	// Constructors
	public Point_2D() {
		super();
	}

	public Point_2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Getter and setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point_2D [x=" + x + ", y=" + y + "]";
	}

	// Methods
	public double distance(Point_2D p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public Point_2D diemDoiXung() {
		this.x *= -1;
		this.y *= -1;
		return new Point_2D(this.x, this.y);
	}

	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
}
