package lecture18;

public class _1_factorial_RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		System.out.println(fac(n));
		
	}
	
	public static int fac(int n) {
		if (n==1) {
			return 1;
		}
		int fn = fac(n-1);
		return fn*n;
		
	}

}
