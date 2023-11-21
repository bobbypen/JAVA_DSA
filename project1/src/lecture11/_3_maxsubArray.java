package lecture11;

public class _3_maxsubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr));
		
	}

	
	public static int maxSubArray(int [] arr) {
		
		int ans = Integer.MIN_VALUE; // 0 na lekr integer.invalue taki ye nagative bi store -output de -2pow31 tk
		for (int i = 0; i < arr.length; i++) {
			int prev = 0;
			for (int j = i; j < arr.length; j++) {
				
				prev = prev + arr[j];
				ans = Math.max(ans, prev);
			}
		}
		return ans;
	}
}
