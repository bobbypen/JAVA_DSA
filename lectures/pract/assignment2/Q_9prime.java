package assignment2;

public class Q_9prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		
		prime(n,2,0);
		
		
		
	}
	
	public static void prime(int n,int i,int fact) {
//		if (fact==0 && i) {
//			System.out.println("prime");
//			return;
//		}
		
		
		if (fact!=0) {
			System.out.println("not prime");
			return;
		}
		
		if (n%i!=0) {
			fact++;
		}
		prime(n, i+1, fact);
	}

}
