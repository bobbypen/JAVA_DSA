package lecture18;

public class _3_print_num_RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pd(n);
	}
	
	public static void pd(int n) {
		if (n==0) {
			return;
		}
	
//		System.out.println(n); try both
		
		
		pd(n-1);
		System.out.println(n);
		
		
	}

}
