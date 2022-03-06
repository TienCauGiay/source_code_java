package data.java_oop.phanso;

import java.util.Scanner;

/*
 * 2. Tạo một tập hợp các phân số. Hãy thực hiện chương trình:
◼ Tìm phân số lớn nhất trong tập phân số.
◼ Tính tổng các phân số.
◼ Xác định số phân số không phải số nguyên.
 */

public class Mian2PhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		PhanSo ps[] = null;
//		int n = 5;
//		ps = new PhanSo[n];
//		for (int i = 0; i < n; i++) {
//			System.out.println("Nhap phan so thu " + (i + 1) + " : ");
//			ps[i] = new PhanSo();
//			ps[i].nhapPhanSo();
//		}
		
		PhanSo ps1 = new PhanSo(1, 2);
		PhanSo ps2 = new PhanSo(-2, 7);
		PhanSo ps3 = new PhanSo(10, 5);
		PhanSo ps4 = new PhanSo(-9, 7);
		PhanSo ps5 = new PhanSo(2, 3);
		PhanSo ps6 = new PhanSo(-3, 4);
		
		PhanSo[] ps = {ps1, ps2, ps3, ps4, ps5, ps6};
		double max = ps[0].giaTriPhanSo();
		PhanSo lonNhat = ps[0];
		for (int i = 1; i < ps.length; i++) {
			if (max < ps[i].giaTriPhanSo()) {
				max = ps[i].giaTriPhanSo();
				lonNhat = ps[i];
			}
		}
		System.out.println("Phan so lon nhat la: " + lonNhat);
		double tongPhanSo = 0.0;
		for (int i = 0; i < ps.length; i++) {
			tongPhanSo += ps[i].giaTriPhanSo();
		}
		System.out.println("Tong cac phan so la: " + tongPhanSo);

		for (int i = 0; i < ps.length; i++) {
			if (ps[i].checkPhanSoNguyen())
				System.out.println("Phan so " + ps[i] + " khong phai la so nguyen");
		}

		sc.close();
	}

}
