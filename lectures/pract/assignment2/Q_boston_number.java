package assignment2;

public class Q_boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		
		
		
		int sum = 0;
		int num = 378;
		while(num>1) {
			
//			System.out.println(num);
			if (num%n==0) {
			num=num/n;
			sum=sum+n;
//			System.out.println(sum);
			}
			else {
				n++;
			}
		}
		
		System.out.println(sum);
	}

}
