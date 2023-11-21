package assignment2;

public class Q_4printreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456789;
		print(n,0);
	}

	public static void print(int n , int sum) {
		if (n==0) {
			System.out.println(sum);
			return;
		}
		
		int rem = n%10;
		sum = sum*10+rem;
//		n = n/10; 
		print(n/10,sum);
		
		
	}
	
}
