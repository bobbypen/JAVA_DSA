package _1_Love_Babbar_DSA;

import java.util.Arrays;

public class Kth_smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7, 10, 4, 20, 15};
		int k = 4;
		System.out.println(kth(arr,k));
	}
public static int kth(int [] arr , int k) {
	Arrays.sort(arr);
	
	int small = arr[k-1];
	
	return small;
	
}
}
