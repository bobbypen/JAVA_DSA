package lecture22;
import java.util.*;
public class _2_tower_of_hoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		toh(n,"A","B","C");
	}

	public static void toh(int n , String src,String hlp,String des) {
		if (n==0) {
			return;
		}
		
		toh(n-1,src,des,hlp);
		System.out.println("Moving ring " + n + " from " + src + " to " + des);
		toh(n-1,hlp,src,des);
		
	}
		
}
