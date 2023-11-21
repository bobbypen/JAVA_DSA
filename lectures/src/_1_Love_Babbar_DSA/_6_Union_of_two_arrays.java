package _1_Love_Babbar_DSA;

public class _6_Union_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1 ,2 ,3 ,4, 5};
		int [] arr1 = {1,2,3};
		int n = arr.length;
		int m = arr1.length;
		
		System.out.println(union(arr,arr1,n,m));
		
		
	}
	public static int union(int[] arr,int [] arr1,int n,int m) {
		int count = n+m;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]==arr[j]) {
					count--;
				}
			}
		}
		
		
		
		return count;
	}
	

}
