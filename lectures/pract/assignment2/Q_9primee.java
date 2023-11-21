package assignment2;

public class Q_9primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		int fact =0;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				fact++;
			}
		}
		
		
		if (fact>=1) {
			System.out.println("noy");
		}else {
			System.out.println("prime");
		}
	}

}
