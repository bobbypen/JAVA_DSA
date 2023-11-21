package assignment_2;
import java.util.Scanner;
public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fact = 0;
		//
		int i = 2 ;
		while(i<=n-1) {
			if(n%i==0) {
				fact++;
				break;
			}
			i++;
		}
		if(fact>=1) {
			System.out.println("this is not prime");
		}else {
			System.out.println("this is prime");
		}
		
	}

}
