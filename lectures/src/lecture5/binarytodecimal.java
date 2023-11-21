package lecture5;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * 2;
		}
		
		System.out.println(sum);
	}

}
