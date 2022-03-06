package data.java_oop.phanso;

import java.util.Scanner;

/*
 * 1. Mỗi phân số P được định nghĩa bằng 2 thành phần là tử số T và mẫu
số M và được biểu diễn P = T/M trong đó tử số và mẫu số là các giá
trị nguyên. Hãy xây dựng lớp phân số.
◼ Định nghĩa các thuộc tính của lớp phân số.
◼ Xây dựng các hàm tạo: mặc định, có đối.
◼ Xây dựng các hàm getters, setters và hàm toString.
◼ Xây dựng hàm riêng:
◼ Tính tổng, hiệu, tích và thương của 2 phân số.
◼ So sánh 2 phân số.
◼ Rút gọn phân số.
2. Tạo một tập hợp các phân số. Hãy thực hiện chương trình:
◼ Tìm phân số lớn nhất trong tập phân số.
◼ Tính tổng các phân số.
◼ Xác định số phân số không phải số nguyên.
 * 
 */

public class PhanSo {
	private int T;
	private int M;

	public PhanSo() {

	}

	public PhanSo(int t, int m) {
		T = t;
		M = m;
	}

	public int getT() {
		return T;
	}

	public void setT(int t) {
		this.T = t;
	}

	public int getM() {
		return M;
	}

	public void setM(int m) {
		this.M = m;
	}

	public PhanSo tong(PhanSo b) {
		PhanSo a = new PhanSo();
		a.T = this.T * b.M + this.M * b.T;
		a.M = this.M * b.M;
		return a;
	}

	public PhanSo hieu(PhanSo b) {
		PhanSo a = new PhanSo();
		a.T = this.T * b.M - this.M * b.T;
		a.M = this.M * b.M;
		return a;
	}

	public PhanSo tich(PhanSo b) {
		PhanSo a = new PhanSo();
		a.T = this.T * b.T;
		a.M = this.M * b.M;
		return a;
	}

	public PhanSo thuong(PhanSo b) {
		PhanSo a = new PhanSo();
		a.T = this.T * b.M;
		a.M = this.M * b.T;
		return a;
	}

	public static int UCLN(int a, int b) {
		int r = 0;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public PhanSo rutGon() {
		int ucln = PhanSo.UCLN(this.T, this.M);
		if (ucln != 1) {
			this.T /= ucln;
			this.M /= ucln;
		}
		return this;
	}

	public int soSanh(PhanSo b) {
		double t1 = (double) this.T / this.M;
		double t2 = (double) b.T / b.M;
		if (t1 > t2)
			return 1;
		if (t1 < t2)
			return 2;
		return 3;
	}

	static Scanner sc = new Scanner(System.in);

	public void nhapPhanSo() {
		System.out.println("Nhap tu so: ");
		this.setT(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap mau so: ");
		this.setM(sc.nextInt());
	}

	public double giaTriPhanSo() {
		double gtri = (double) this.T / this.M;
		return gtri;
	}
	
	public boolean checkPhanSoNguyen() {
		if(this.T % this.M != 0)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return T + "/" + M;
	}

}
