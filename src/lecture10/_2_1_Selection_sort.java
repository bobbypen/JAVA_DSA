package lecture10;

import java.util.Iterator;

public class _2_1_Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
	public static void sort(int [] arr ) {
	
		for (int i = 0; i < arr.length; i++) {
			int min	 = i;
			for (int j = i+1; j < arr.length; j++) { // kuki j = 0 already min assume kr li hain
				if(arr[j]<arr[min]) { // 4<5
					min = j;		// min = 1
				}
				
			}					//aafter loop 
			int temp = arr[i];
			arr[i] =arr[min];
			arr[min] = temp;
		}
	}
}
