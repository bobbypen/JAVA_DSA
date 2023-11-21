package assignment3;

public class water_tap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,1,2,4,1};
		tap(arr);
		
		
	}
	public static void tap(int [] arr) {
		int n = arr.length;
		int sum = 0;
		int [] right = new int[n];
		int [] left = new int [n];
		left [0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		right[n-1] = arr[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		
		for (int i = 0; i < left.length; i++) {
			left[i] = Math.min(right[i], left[i]);
			sum = sum+ ( left[i] - arr[i]);
		}
		
		System.out.println(sum);
		
	}

}
