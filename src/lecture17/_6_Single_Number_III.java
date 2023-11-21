package lecture17;

public class _6_Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Index(arr));

	}
	
	public static int Index(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans^arr[i];
		}
		int mask = (ans & (~(ans-1)));//10
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]&mask) !=0) {
				a^=arr[i];
			}
		}
		
		int b = ans^a;
		
		int [] ar = {a,b};
		return ar;
}

}
