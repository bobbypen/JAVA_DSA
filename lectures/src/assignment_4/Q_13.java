package assignment_4;
import java.util.*;
public class Q_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = (int) Math.sqrt(a);
		 System.out.println(squareroot(a,x));
	}
	
	
	public static int squareroot(int a , int x) {
		int low = 0;
		int high = a;
		while(low<=high) {
			int mid = (low + high)/2;
			if(Math.pow(mid, 2) == a) {
				return mid;
			}else if(Math.pow(mid, 2)>a) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return x;
	}



}
