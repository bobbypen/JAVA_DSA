package assignment_5;
import java.util.*;
public class Q_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while (t>0) {
			
		
		
		int n = sc.nextInt();
		bit(n);
		
		
		t--;
		}
	}

	public static void bit(int n) {
		int count = 0;
		while (n>0) {
			if ((n&1)==1) {
				count++;
				}
			n = n>>1;
		}
		System.out.println(count);
		
	}
	
	
	
}
