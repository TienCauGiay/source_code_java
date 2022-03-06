package data.java_basic;

public class StringBasic {

	public static void main(String[] args) {
		String S_input = "Lap trinh Java khong don gian";
		S_input = S_input.replace("a", "");
		StringBuilder str = new StringBuilder(S_input);
		System.out.println("Chuỗi đảo ngược là: \n" + str.reverse().toString());
	}
}
