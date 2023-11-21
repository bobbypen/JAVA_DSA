package assignment_6;
import java.util.*;
public class Q_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n,0,0);
		
	}
	public static void print(int n,int rem, int num) {
		if (n==0) {
			
			return;
		}
		
		
		
		 rem = n%10;
		 if (rem == 0) {
			rem = 5;
		}
		 
		
		n = n/10;
		print(n,rem,num);
		num = num*10+rem;
		System.out.print(num);
	
		
		
	}
	
}
