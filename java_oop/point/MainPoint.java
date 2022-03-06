package data.java_oop.point;

import java.util.ArrayList;
import java.util.List;

public class MainPoint {

	public static void main(String[] args) {
		Point_2D point_2d1 = new Point_2D(1.0, 0.0);
		Point_2D point_2d2 = new Point_2D(3.0, 0.0);

		Point_3D point_3d1 = new Point_3D(0.0, -2.0, 0.0);
		Point_3D point_3d2 = new Point_3D(-2.0, 0.0, 0.0);

		List<Point_2D> a = new ArrayList<Point_2D>();
		a.add(point_2d1);
		a.add(point_2d2);
		a.add(point_3d1);
		a.add(point_3d2);

		Point_3D d = new Point_3D(0, 0, 0);
		double sum = 0;

		for (Point_2D point_2d : a) {
			sum += point_2d.distance(d);
		}

		System.out.println("Tong khoang cach: " + sum);

		a.add(point_2d1.diemDoiXung());
		a.add(point_2d2.diemDoiXung());
		a.add(point_3d1.diemDoiXung());
		a.add(point_3d2.diemDoiXung());

		for (Point_2D point_2d : a) {
			System.out.println(point_2d.toString());
		}
	}
}
