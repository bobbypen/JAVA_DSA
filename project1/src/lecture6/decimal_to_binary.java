package lecture6;
import java.util.Scanner;
public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int ans = 0;
		int mul = 1;
		while(a>0) {
			int rem = a%2;
			ans = ans+rem*mul;
			mul = mul*10;
			a = a/2;
			
			
			
		}
		System.out.println(ans);
	}

}
