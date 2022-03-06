package data.java_basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTinh {

	public static int demSoPhanTuKhongChiaHetCho_3(int[] a) {
		int count = 0;
		for (int i : a) {
			if (i % 3 != 0) {
				count++;
			}
		}
		return count;
	}

	public static void tongCacPhanTuVaTrungBinhCong(int[] a) {
		int tong = 0;
		double tbc = 0.0;
		int count = 0;
		for (int i : a) {
			if (i >= -5 && i <= 25) {
				tong += i;
				count++;
			}
		}
		tbc = (double) tong / count;
		System.out.println("Tổng của dãy trong khoảng [-5; 25] là: " + tong);
		System.out.println("Trung bình cộng của dãy trong khoảng [-5; 25] là : " + tbc);
	}

	public static int phanTuLonNhatTrongDayChiaHetCho_3(int[] a) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : a) {
			if (i % 3 == 0) {
				list.add(i);
			}
		}
		int max = list.get(0);
		int n = list.size();
		for (int i = 1; i < n; i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

	public static void sapXepTheoTriTuyetDoiTangDan(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(a[i]) > Math.abs(a[j])) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
	}

	public static void deletePhanTuChiaHetCho5NhungKhongChiaHetCho3(int[] a) {
		List<Integer> l = new ArrayList<>();
		for (int i : a) {
			l.add(i);
		}
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			int gt = itr.next();
			if (gt % 5 == 0 && gt % 3 != 0) {
				itr.remove();
			}
		}
		System.out.println();
		for (Integer integer : l) {
			System.out.printf(integer + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 15, 9, 4, 20, 50, -44, 32 };
		for (int i : a) {
			System.out.printf(i + " ");
		}
		System.out.println("\nSố phần tử k chia hết cho 3 là: " + demSoPhanTuKhongChiaHetCho_3(a));

		tongCacPhanTuVaTrungBinhCong(a);

		System.out.println("Phần tử lớn nhất trong dãy chia hết cho 3 là: " + phanTuLonNhatTrongDayChiaHetCho_3(a));

		sapXepTheoTriTuyetDoiTangDan(a);
		for (int i : a) {
			System.out.printf(i + " ");
		}

		deletePhanTuChiaHetCho5NhungKhongChiaHetCho3(a);
	}


}
