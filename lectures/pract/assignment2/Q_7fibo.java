package assignment2;

public class Q_7fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			
			int c = a+b;
			a=b;
			b=c;
			
		}
		System.out.println(a);
		
	}

}
