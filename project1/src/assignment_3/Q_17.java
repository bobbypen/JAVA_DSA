package assignment_3;
import java.util.*;
public class Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//{8,-8,9,-9,10,-11,12}
		
		int t = sc.nextInt();
		while(t>0) {
		int n  = sc.nextInt();
		int [] arr  = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//	int arr[] = {8,-8,9,-9,10,-11,12};
		
		System.out.println(maxsum(arr));
	
		t--;
		}
	}


	public static int kadane(int []arr) {
		int prev = 0;
		int ans = 0; 
		for (int i = 0; i < arr.length; i++) {
			
			prev = prev + arr[i];
			ans = Math.max(ans, prev);
			if (prev<0) {
				prev=0;
			}
			
		}
		return ans;
		
		
	}
	
	
	public static int maxsum(int []arr) {
		int k = kadane(arr);
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			
			sum	 = sum + arr[i];
			arr[i] = arr[i] * (-1);
			
		}
		
		int z = kadane(arr);
		return (Math.max(k, z+sum));
		
		
		
	}
	
	
	
}