package data.java_basic;

import java.util.Scanner;

public class Fibonaci {

	public static long fibonaci(int n) {
		if (n < 2)
			return n;
		long n1 = 1, n2 = 0; // lưu cơ sở vào các biến
		for (int i = 2; i < n; i++) {
			long n0 = n1 + n2;
			n2 = n1;
			n1 = n0;
		}
		return n1 + n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 5;
		System.out.println("Giá trị phần tử thứ " + index + " của dãy fibonaci là: " + fibonaci(index));

		System.out.println("Nhập n = ");
		int n = sc.nextInt();
		int dem = 1;
		while (fibonaci(dem) < n) {
			dem++;
		}
		if (fibonaci(dem) - n > n - fibonaci(dem - 1)) {
			System.out.println("Phần tử trong dãy fibonaci gần nhất với " + n + " là: " + fibonaci(dem - 1));
		} else {
			System.out.println("Phần tử trong dãy fibonaci gần nhất với " + n + " là: " + fibonaci(dem));
		}
		sc.close();
	}
}
