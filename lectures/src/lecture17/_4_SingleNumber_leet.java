package lecture17;

public class _4_SingleNumber_leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,1,2,1,2};
		System.out.println(single(arr));
		
	}

	public static int single(int [] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
	
	
}
