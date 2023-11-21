package lecture19;
import java.util.*;
public class _5_fac_recursion {

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
	
	int fn = fac(n-1);
	return fn * n;
	}
}
