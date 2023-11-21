package leetcode;

public class _10_key_paid {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques = "23";
		keypaid(ques, "");
	}

	public static void keypaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans + "");
			return;
		}

		char ch = ques.charAt(0);
		int idx = ch - '0';
		String press = code[idx];
		for (int i = 0; i < press.length(); i++) {
			keypaid(ques.substring(1), ans + press.charAt(i));
		}
	}

}
