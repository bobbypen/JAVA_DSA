package assignment2;

public class Q_6lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divident = 10;
		int divisor = 6;
	int hcf =	gcd(divident,divisor);
		System.out.println(divident*divisor/hcf);


	}
	
	public static int gcd(int divident,int divisor) {
		while (divident%divisor!=0) {
			
			
			int rem = divident%divisor;
			divident = divisor;
			divisor = rem;
			
		}
		return divisor;
	}

}
