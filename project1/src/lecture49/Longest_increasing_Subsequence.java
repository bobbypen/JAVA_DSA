package lecture49;

import java.util.Arrays;

public class Longest_increasing_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,9,2,5,3,7,101,18};
		
		System.out.println(lis(arr));

	}
	
	public static int lis(int []arr) {
		int [] dp = new int [arr.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1;
			
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = i-1; j >= 0; j--) {
				if (arr[i]>arr[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
		}
		
		
		
		return Arrays.stream(dp).max().getAsInt();
	}
	
	
	

}
