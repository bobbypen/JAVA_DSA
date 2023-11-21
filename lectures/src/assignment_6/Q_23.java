package assignment_6;

public class Q_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		print (n,0);
	}
public static int print(int n,int sum) {
	if (n==0) {
		System.out.println(sum);
		return 0; 
	}
	
	return print(n-1,sum+n);
}
}
