package asss1;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int divident = 16; 
		int divisor = 24;
		
		while (divident%divisor!=0) {
			int rem = divident%divisor;
			
			divident = divisor;
			divisor = rem;
		}
		
		System.out.println(divisor);
	}

}
