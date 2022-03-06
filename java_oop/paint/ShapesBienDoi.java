package data.java_oop.paint;

//Đây là một lớp ảo chỉ chứa các phương thức ảo => thay thế nó bằng Interface
//Chú ý:
//1 - Các phương thức trong interface đều là các phương thức ảo
//=> không cần khai báo từ khóa abstract.

//2 - Gom các phương thức có cùng mục đích vào một interface

public interface ShapesBienDoi extends ShapesInterface {
	// B. Xây dựng các phương thức biến đổi hình học
	// Xây dựng bộ khung của đối tượng - xác định các hành vi của đối tượng
	// 1. Phương thức dịch chuyển
	public void move(double dx, double dy);

	// 2. Phương thức xoay
	public void rotate(double alpha);

	// 3. Phương thức zoom
	public void zoom(double ratio);

	// 4. Phương thức tâm
	public Point center();
}
