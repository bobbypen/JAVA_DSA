package lecture18;

public class _2_number_pow_RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int po = 3;
		System.out.println(pow(n,po));
		
	}
	
	public static int pow(int n,int po) {
		if (po==0) {
			return 1;
		}
		int fn = pow(n,po-1);
		return fn*n;
		
	}

}
