package data.java_oop.paint;

public class Circle implements ShapesBienDoi, ShapesTinhToan {
	// Attributes
	private Point tam;
	private double r;

	// Constructors
	public Circle(Point tam, double r) {
		super();
		this.tam = tam;
		this.r = r;
	}

	public Circle() {
		super();
	}

	// Getter and setter
	public Point getTam() {
		return tam;
	}

	public void setTam(Point tam) {
		this.tam = tam;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [tam=" + tam + ", r=" + r + "]";
	}

	@Override
	public double area() {
		double S = this.r * this.r * Math.PI;
		return S;
	}

	@Override
	public double perimeter() {
		double P = 2 * this.r * Math.PI;
		return P;
	}

	@Override
	public void move(double dx, double dy) {
		this.tam.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {

	}

	@Override
	public void zoom(double ratio) {
		this.r *= ratio;
	}

	@Override
	public Point center() {
		return this.tam;
	}
}
