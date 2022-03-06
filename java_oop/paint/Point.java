package data.java_oop.paint;

public class Point implements ShapesBienDoi, ShapesTinhToan {
	// Attributes
	private double x;
	private double y;

	public Point() {
		super();
	}

	public Point(double x, double y) {
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
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 0;
	}

	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	@Override
	public void rotate(double alpha) {

	}

	@Override
	public void zoom(double ratio) {

	}

	@Override
	public Point center() {
		return this;
	}

	// Methods
	public double distance(Point p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public void zoom(double ratio, Point center) {
		this.x = (this.x - center.x) * ratio + center.x;
		this.y = (this.y - center.y) * ratio + center.y;
	}

	public void rotate(double alpha, Point center) {
		double x = (this.x - center.x) * Math.cos(alpha) - (this.y - center.y) * Math.sin(alpha) + center.x;
		double y = (this.x - center.x) * Math.sin(alpha) + (this.y - center.y) * Math.cos(alpha) + center.y;
		this.x = x;
		this.y = y;
	}

}
