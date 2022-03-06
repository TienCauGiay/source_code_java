package data.java_oop.paint;

public class Triangle implements ShapesBienDoi, ShapesTinhToan {
	// Attributes
	private Point pA;
	private Point pB;
	private Point pC;

	// Constructors
	public Triangle() {
		super();
	}

	public Triangle(Point pA, Point pB, Point pC) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	// Getter and setter
	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	@Override
	public String toString() {
		return "Triangle [pA=" + pA + ", pB=" + pB + ", pC=" + pC + "]";
	}

	@Override
	public double area() {
		double p = this.perimeter() / 2.0;
		double result = p * (p - this.pA.distance(this.pB)) * (p - this.pB.distance(this.pC))
				* (p - this.pC.distance(this.pA));
		return Math.sqrt(result);
	}

	@Override
	public double perimeter() {
		double cv = this.pA.distance(this.pB) + this.pB.distance(this.pC) + this.pC.distance(this.pA);
		return cv;
	}

	@Override
	public void move(double dx, double dy) {
		this.pA.move(dx, dy);
		this.pB.move(dx, dy);
		this.pC.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		Point center = this.center();
		this.pA.rotate(alpha, center);
		this.pB.rotate(alpha, center);
		this.pC.rotate(alpha, center);
	}

	@Override
	public void zoom(double ratio) {
		Point center = this.center();
		this.pA.zoom(ratio, center);
		this.pB.zoom(ratio, center);
		this.pC.zoom(ratio, center);
	}

	@Override
	public Point center() {
		double x = (this.pA.getX() + this.pB.getX() + this.pC.getX()) / 3.0;
		double y = (this.pA.getY() + this.pB.getY() + this.pC.getY()) / 3.0;
		return new Point(x, y);
	}

}
