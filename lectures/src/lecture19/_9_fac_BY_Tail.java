package lecture19;

import java.util.Scanner;

public class _9_fac_BY_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int ans = 1;
		
		System.out.println(fac(n,ans));
	}
	public static int fac(int n,int ans) {
	if (n==0) {
		return 1;
	}
	
//	int fn = fac(n-1);
	return  n * fac(n-1,ans*n);  // this is tail recursion , check in notebook
	}
}