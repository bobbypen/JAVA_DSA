package lecture10;

public class _3_insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	[] arr = {5,4,3,2,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int [] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int picked  = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>picked) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = picked;
		}
	}

}
