package assignment_5;
import java.util.*;
public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner	(System.in);
		int t = sc.nextInt();
		while (t>0) {
			
			int a = sc.nextInt();
			System.out.println(bit(a));
			t--;
		}
		
		
	}

	public static int bit(int a) {
		int count = 0;
		while(a>0) {
		if ((a&1)== 1) {
			
		
			count++;
		}
		a = a>>1;
		}
		return count;
	}
	
}
