package lecture19;

import java.util.Scanner;

public class _8_fac_rec_head {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
	if (n==0) {
		return 1;
	}
	
//	int fn = fac(n-1);
	return  n * fac(n-1);  // this is head recursion , kuki jbtk call hone ke baad hi multiple hoga
	}
}