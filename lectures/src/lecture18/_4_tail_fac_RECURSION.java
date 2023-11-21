package lecture18;

public class _4_tail_fac_RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		System.out.println(fac(n,1));
		
	}
	
	public static int fac(int n,int ans) {
		if (n==1) {
			return ans;
		}
		
		return fac(n-1,ans*n);
		
	}

}
