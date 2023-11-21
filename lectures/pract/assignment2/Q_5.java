package assignment2;

public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 101010;
		
		
		print(n,1,0);
		
	}
public static void print(int n,int mul,int ans) {
	if (n==0) {
		System.out.println(ans);
		return;
	}
	
	
	int rem = n%10;
//	ans = ans + rem*mul;
//	mul = mul *2;
//	n=n/10;
	print(n/10, mul*2, ans+rem*mul);
}
}
