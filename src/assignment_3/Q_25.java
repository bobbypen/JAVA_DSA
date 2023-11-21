package assignment_3;
import java .util.Scanner;
public class Q_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		int rem = x % y;
		
		int m = y - rem;
		
		if (rem<m) {
			System.out.println(rem);
		}else {
			System.out.println(m);
		}
		
		
	
		
		
		
		
		}
			
		
	}

}
