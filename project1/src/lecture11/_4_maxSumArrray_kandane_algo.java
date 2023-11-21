package lecture11;

public class _4_maxSumArrray_kandane_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(sum(arr));
	}
	public static int sum(int [] arr) {
		
		int prev = 0; // jo current sum rahega
		int ans = 0; //tack of maximum
		for (int i = 0; i < arr.length; i++) {
			
			prev = prev + arr[i];
			ans = Math.max(ans, prev);
			if (prev <0) {
				prev = 0;
			}
			
		}
		return ans;
	}
}
