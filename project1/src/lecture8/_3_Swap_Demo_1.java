package lecture8;

public class _3_Swap_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
				int [] arr = {10,20,30,40,50};
				
				System.out.println(arr[0] + " " + arr[1]);
				swap(arr);
				System.out.println(arr[0] + " " + arr[1]);
				
				
			}
			
			public static void swap(int [] arr) {
				int temp = arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}

		

	}


