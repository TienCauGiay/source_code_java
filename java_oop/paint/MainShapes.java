package data.java_oop.paint;

import java.util.ArrayList;
import java.util.List;

public class MainShapes {

	public static void main(String[] args) {

		// Khởi tạo các đối tượng
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(3.0, 0.0);
		Point p3 = new Point(0.0, 4.0);

		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p2, p3);

		Circle c1 = new Circle(p1, 5.0);
		Circle c2 = new Circle(p2, 2.0);

		Triangle t1 = new Triangle(p1, p2, p3);

		List<ShapesInterface> list = new ArrayList<ShapesInterface>();

		// thêm các đối tượng vào danh sách để quản lí
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(l1);
		list.add(l2);
		list.add(c1);
		list.add(c2);
		list.add(t1);

		// Hiển thị danh sách các hình đã tạo ra
		for (ShapesInterface s : list) {
			System.out.println(s.toString());
		}

		// Tính tổng chu vi và diện tích các hình
		double cv = 0.0;
		double dt = 0.0;
		for (ShapesInterface s : list) {
			if (s instanceof ShapesTinhToan) {
				cv += ((ShapesTinhToan) s).perimeter();
				dt += ((ShapesTinhToan) s).area();
			}
		}
		System.out.println("Tổng chu vi: " + cv);
		System.out.println("Tổng diện tích: " + dt);

		List<ShapesInterface> list2 = new ArrayList<ShapesInterface>();
		list2.add(c1);
		list2.add(c2);
		list2.add(t1);
		double min = ((ShapesTinhToan) list2.get(0)).area();
		double max = ((ShapesTinhToan) list2.get(0)).area();
		ShapesInterface hinhMin = new ShapesInterface() {
		};
		ShapesInterface hinhMax = new ShapesInterface() {
		};
		for (ShapesInterface s : list2) {
			if (s instanceof ShapesTinhToan) {
				if (((ShapesTinhToan) s).area() < min) {
					min = ((ShapesTinhToan) s).area();
					hinhMin = s;
				}
				if (((ShapesTinhToan) s).area() > max) {
					max = ((ShapesTinhToan) s).area();
					hinhMax = s;
				}
			}
		}
		System.out.println("Hình có diện tích nhỏ nhất là: " + min + " " + hinhMin.toString());
		System.out.println("Hình có diện tích lớn nhất là: " + max + " " + hinhMax.toString());
	}
}
