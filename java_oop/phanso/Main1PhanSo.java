package data.java_oop.phanso;

public class Main1PhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(1, 2);
		PhanSo b = new PhanSo(3, 4);

		PhanSo c1 = a.tong(b);
		c1.rutGon();
		System.out.println("Phan so tong la: " + c1);

		PhanSo c2 = a.hieu(b);
		c2.rutGon();
		System.out.println("Phan so hieu la: " + c2);

		PhanSo c3 = a.tich(b);
		c3.rutGon();
		System.out.println("Phan so tich la: " + c3);

		PhanSo c4 = a.thuong(b);
		c4.rutGon();
		System.out.println("Phan so thuong la: " + c4);

		if (c1.soSanh(c2) == 1)
			System.out.println("Phan so " + c1 + " lon hon phan so " + c2);
		if (c1.soSanh(c2) == 2)
			System.out.println("Phan so " + c1 + " nho hon phan so " + c2);
		if (a.soSanh(b) == 3)
			System.out.println("Phan so " + a + " bang phan so " + b);
	}

}
