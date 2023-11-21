package lecture27;

public class _3_quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {7,5,3,2,1};
		sort(arr,0,arr.length-1);
		
	}
		public static void sort(int [] arr, int si,int ei) {
			if (si>=ei) {
				return;
			}
			
			
		int idx = partition(arr,si,ei);
		sort(arr,si,idx-1);
		sort(arr,idx+1,ei);
		
		
		
		
	}
	public static int partition(int [] arr,int si , int ei) {//start index ,end index
		int item = arr[ei];
//		int pi = si;
		int pi = si;
		for (int i = si; i < ei; i++) {
			if (arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}
			
		}
		
		
		int temp = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = temp;
		return pi;
	}

}
