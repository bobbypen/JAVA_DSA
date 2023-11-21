package assignment_6;

public class Q_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		print(n);
		
	}
	
	public static void print(int n) {
		if (n==0) {
			return;
		}
		if (n%2!=0) {
			
		
		System.out.println(n);
		}
		print(n-1);
		
		if (n%2==0) {
			
		
		System.out.println(n);
		}
		}
	
	
}
