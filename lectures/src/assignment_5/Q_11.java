package assignment_5;
import java.util.*;
public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while (Q>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(set(a,b));
			Q--;
		}
		
	}

	public static int set(int a,int b) {
		
		int count = 0;
		
		for (int i = a; i <= b; i++) {
			int ab = i;
			while (ab>0) {
				if ((ab&1)==1) {
					count++;
				}
				ab = ab>>1;
			}
		}
		
		return count;
	}
	
}
