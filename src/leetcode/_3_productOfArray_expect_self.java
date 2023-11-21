package leetcode;
import java.util.*;
public class _3_productOfArray_expect_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		}
	
	public static int[] product(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 0; i < left.length; i++) {
			left[i] = left[i-1] * arr[i-1];
			
		}
		int [] right = new int[n];
		right[n-1] =1;
		
		for (int i = n-2; i >=0; i--) {
			right[i] = right[i + 1] * arr [i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
		
	}
	
	
	}

