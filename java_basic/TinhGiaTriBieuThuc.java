package data.java_basic;

public class TinhGiaTriBieuThuc {

	public static int giaiThua(int n) {
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		return gt;
	}

	public static long luyThua(int a, int n) {
		if (n == 1) {
			return a;
		} else {
			long x = luyThua(a, n / 2);
			if (n % 2 == 0) {
				return x * x;
			} else {
				return x * x * a;
			}
		}

	}

	public static void main(String[] args) {
		int n = 2;
		double S = 1.0;
		double S2 = 0;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			S2 += (giaiThua(n) * luyThua(x, i)) / (giaiThua(n - i - 1) * giaiThua(i));
		}
		S += S2;
		System.out.println("S = " + S);
	}
}
