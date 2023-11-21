package lecture27;

public class Q_1_partiton_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,2,1,8,3,4};
		int idx = partition(arr,0,arr.length-1);
		
		System.out.println(idx);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
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
