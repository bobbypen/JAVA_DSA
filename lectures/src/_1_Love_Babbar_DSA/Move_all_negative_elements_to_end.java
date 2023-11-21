package _1_Love_Babbar_DSA;

public class Move_all_negative_elements_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input : 
			int n = 8;
		int	arr[] = {-5, 7, -3, -4, 9, 10, -1, 11};
//			Output : 
//			1  3  2  11  6  -1  -7  -5
		segregateElements(arr ,n); 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void segregateElements(int[] arr , int n) {
		int [] arr1 = new int[n];
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				arr1[j] = arr[i];
				j++;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				arr1[j] = arr[i];
				j++;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = arr1[i];
			
		}
	}

}
