package lecture8;

public class practice_1 {
// reversal algo part 1 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dragan
		//Given
		
		int [] arr = {1,2,3,4,5,6,7};
		int k = 3;
		reversal(arr,k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void reversal(int [] arr, int k ) {
		k = k%arr.length;
		int n = arr.length;
		for (int i = 1; i <= k; i++) {
			int temp = arr[n-1];
			for (int j = arr.length-2; j >=0; j--) {
				arr[j+1] = arr[j];
			}                     
			arr[0] = temp;
		}
		
		
	}

}
