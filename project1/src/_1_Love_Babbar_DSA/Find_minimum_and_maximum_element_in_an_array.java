package _1_Love_Babbar_DSA;
import java.util.*;	
public class Find_minimum_and_maximum_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 1, 56, 10000, 167};
		
		getminmax(arr);
	}
	public static void getminmax(int [] arr) {
		 int min = 0;
	       int max = 0;
	       Arrays.sort(arr);
	       min = arr[0];
	       max = arr[arr.length-1];
	       System.out.println(min + " " + max);
	       
	}
}
