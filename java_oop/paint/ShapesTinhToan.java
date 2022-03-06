package data.java_oop.paint;

//Đây là một lớp ảo chỉ chứa các phương thức ảo => thay thế nó bằng Interface
//Chú ý:
//1 - Các phương thức trong interface đều là các phương thức ảo
//=> không cần khai báo từ khóa abstract.

//2 - Gom các phương thức có cùng mục đích vào một interface

public interface ShapesTinhToan extends ShapesInterface {
	// A. Xây dựng các phương thức hình học
	// Xây dựng bộ khung của đối tượng - xác định các hành vi của đối tượng
	// 1. Phương thức tính diện tích
	// - Chưa xác định được cách thức cài đặt phương thức
	// => trừu tượng hóa phương thức: sử dụng từ khóa abstract

	public double area();

	// 2. Phương thức tính chu vi
	// - Chưa xác định được cách thức cài đặt phương thức
	// => trừu tượng hóa phương thức: sử dụng từ khóa abstract

	public double perimeter();
}
