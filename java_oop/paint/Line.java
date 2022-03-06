package data.java_oop.paint;

public class Line implements ShapesBienDoi, ShapesTinhToan {
	// Attributes
	private Point dau;
	private Point cuoi;

	// Constructors
	public Line(Point dau, Point cuoi) {
		super();
		this.dau = dau;
		this.cuoi = cuoi;
	}

	public Line() {
		super();
	}

	// Getter and setter
	public Point getDau() {
		return dau;
	}

	public void setDau(Point dau) {
		this.dau = dau;
	}

	public Point getCuoi() {
		return cuoi;
	}

	public void setCuoi(Point cuoi) {
		this.cuoi = cuoi;
	}

	@Override
	public String toString() {
		return "Line [dau=" + dau + ", cuoi=" + cuoi + "]";
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return this.dau.distance(this.cuoi);
	}

	@Override
	public void move(double dx, double dy) {
		this.dau.move(dx, dy);
		this.cuoi.move(dx, dy);
	}

	@Override
	public void rotate(double alpha) {
		Point center = this.center();
		this.dau.rotate(alpha, center);
		this.cuoi.rotate(alpha, center);
	}

	@Override
	public void zoom(double ratio) {
		Point center = this.center();
		this.dau.zoom(ratio, center);
		this.cuoi.zoom(ratio, center);
	}

	@Override
	public Point center() {
		double x = (this.dau.getX() + this.cuoi.getX()) / 2.0;
		double y = (this.dau.getY() + this.cuoi.getY()) / 2.0;
		return new Point(x, y);
	}

}
