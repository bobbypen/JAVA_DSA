package lecture10;

public class _1_2_Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	//i = no. of turn and i = 1 se suru hoga line 16 taki , j joki number ko swap kr ra hain usme condition laga kr ek decrement ho pye line 17 
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}