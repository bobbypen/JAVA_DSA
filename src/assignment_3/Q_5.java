package assignment_3;

public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Arrays-Max Value In Array
		
		int [] arr = {1,2,7,4,5,7,8};
		System.out.println(max(arr));
		
		
		
	}
	
	public static int max(int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
			
		}
		return max;
	} 
	
}
