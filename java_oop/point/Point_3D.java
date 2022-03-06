package data.java_oop.point;

public class Point_3D extends Point_2D {
	// Attributes
	private double z;

	// Constructors
	public Point_3D() {
		super();
	}

	public Point_3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	// Getter ang setter
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point_3D [x=" + this.getX() + " y=" + this.getY() + " z=" + z + "]";
	}

	// Methods
	public double distance(Point_3D p2) {
		double dx = this.getX() - p2.getX();
		double dy = this.getY() - p2.getY();
		double dz = this.getZ() - p2.getZ();
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	@Override
	public Point_3D diemDoiXung() {
		super.diemDoiXung();
		this.z *= -1;
		return this;
	}

	public void move(double dx, double dy, double dz) {
		super.move(dx, dy);
		this.z += dz;
	}

}
