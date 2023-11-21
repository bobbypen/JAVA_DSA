package assignment_3;
import java.util.*;
public class Q_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inputs for array 1 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();
		
		int []arr1 = new int[n];
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(trap(arr1,n));
		t--;
		}
		
		
	
		
	
		
		
		//FUCNTION CAAL
		
	}
	public static int trap(int [] arr1, int n) {
		
		// Code for Arr1
		int [] right = new int [n];
		int [] left = new int	[n];
		
		// left to right;
		left[0] = arr1[0] ;
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(arr1[i], left[i-1]);
		}
		
		//right to left
		right[n-1] = arr1[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i] = Math.max(arr1[i], right[i+1]);
		}
		
		
		//min
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int min	= Math.min(right[i], left[i]);
			ans = ans + (min - arr1[i]);
		}
		return ans;
		
		
	
}
}

	
	// ARRAY-2 
	

