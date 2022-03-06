package data.java_basic;

public class StringBasic2 {

	public static void check(String[] a) {
		String isNum = "[\\-]?[0-9]+[\\.]?[0-9]*"; // isNum là số
		int dem = 0;
		for (String string : a) {
			if (!string.matches(isNum)) // nếu k phải là số
				dem++;
		}

		if (dem == 0)
			System.out.println("true, có " + a.length + " số");

		if (dem != 0)
			System.out.println("false");
	}

	public static void main(String[] args) {
		String S_input1 = "2 34.5 -12.9 0 12 1.98";
		String S_input2 = "2 34.5 -12a.9 0 12 1b.98";
		String[] tachChuoi1 = S_input1.split("\\s");
		String[] tachChuoi2 = S_input2.split("\\s");

		check(tachChuoi1);
		check(tachChuoi2);
	}
}
