package lecture4;
import java.util.Scanner;
public class fibo_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 1;i<=n;i++) {
			int c = a + b;
			System.out.print(c + " ");	
			a=b;
			b=c;
			
		}
		System.out.println(a);
		
	}

}
