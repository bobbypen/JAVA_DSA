package lecture9;

public class _8_reversal_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		int k = 3;
		int n = arr.length;
		rotate(arr,k,n);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

	public static void rotate(int[] arr,int k , int n  ) {
		
		k = k % n;
		
		// first rotate 
		reverse(arr,0,n-k-1);
		
		// last line
		reverse(arr,n-k,n-1);
		
		// whole line
		reverse(arr,0,n-1);
		
	}
	
	public static void reverse(int [] arr , int i , int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
