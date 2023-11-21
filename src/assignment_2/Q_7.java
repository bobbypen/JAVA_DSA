package assignment_2;
import java.util.Scanner;
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;
		while(i<=n) {
			
		int c = a+b;
		
		a=b;
		b=c;
		i++;
		}
		
		System.out.println(a);
	}

}
