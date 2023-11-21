package lecture20;

public class _3_Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printpath(n, 0, "");
	}

	public static void printpath(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans + "");
			return;
		}
		if (curr > n) {
			return;
		}
//		printpath(n, curr + 1, ans + 1);
//		printpath(n, curr + 2, ans + 2);
//		printpath(n, curr + 3, ans + 3);
		
		
		
//		BY for loop
		
		for (int dice = 1; dice <= 3; dice++) {		
			printpath(n, curr + dice, ans + dice);
		}
	}

}
