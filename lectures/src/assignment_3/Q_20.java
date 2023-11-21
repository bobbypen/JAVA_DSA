package assignment_3;
import java.util.*;
public class Q_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		
		int [] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sum(arr,nums);
		for (int i = 0; i < arr.length; i++) {
			System.out.print (nums[i] + " ");
		}
		
	}

	public static void sum(int [] arr, int [] nums) {
		
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans = ans + arr[i];
			nums[i] = ans;
		}
		
	}
	
}
