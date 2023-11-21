
package assignment_3;
import java.util.*;
public class Q_17_c {
//optimum solution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int total = 0;
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			for (int i = 0; i < arr.length; i++) {
				total = total + arr[i];
				
			}
			int ans1 = min(arr);
			int ans2 = max(arr);
			
			int result = total - ans1;
			
			System.out.println(Math.max(ans2,result));
			
			
			
			t--;
		}
		
		
		
	}
	
	public static int min(int [] arr) {
		int n = arr.length;
		int ans = Integer.MAX_VALUE;
		int prev = 0;
		for (int i = 0; i < arr.length; i++) {
			
			prev+=arr[i];
			ans = Math.min(prev, ans);
			if (prev>0) {
				prev=0;
			}
		}
		return ans;
	}
	public static int max(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int prev = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			prev +=  arr[i];
			ans = Math.max(prev, ans);
			if (prev<0) {
				prev=0;
			}
		}
		return ans;
	}
		
	

}
