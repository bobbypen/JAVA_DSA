package asss1;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 6;   //divi
		int num2 = 4;     //divis
		
		int mul = num1 * num2;
		
		while (num1%num2!=0) {
			
			int rem = num1 % num2;
			
			num1 = num2;
			num2 = rem;
			
			
		}
		
		int lcm = mul/num2;
		
		System.out.println(lcm);
		
		
		
	}

}
