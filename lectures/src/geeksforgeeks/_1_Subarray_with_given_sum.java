package geeksforgeeks;
import java.util.*;

public class _1_Subarray_with_given_sum {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		https:practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
		
//		do it try with ARRAYLIST
		
		
		int n = 5;
		int s = 12;
		int [] arr = {1,2,3,5,7};
		ArrayList<Integer> a = maxsum(arr,s,n);
		System.out.println(a);
	}
	public static ArrayList<Integer> maxsum(int []arr,int s,int n){
		
		ArrayList<Integer> ll = new ArrayList<>();
		
		int sum = 0;
		int start = 0;
		
		
		
		if (s <= 0) {
			
			ll.add(-1);
			
			return ll;
		}
		
		
		for (int i = 0; i < n; i++) {
			
			sum = sum + arr[i];
			
			if (s==arr[i]) {
				ll.add(i+1);
				ll.add(i+1);
				return ll;
				
			}
			
			while (sum>s) {
				sum = sum - arr[start];
				start++;
			}
			
			if (sum == s) {
				
				ll.add(start+1);
				ll.add(i+1);
				return ll;
				
			}
			
		}
		
		
		ll.add(-1);
		return ll;
		
	}
	
	
	}

