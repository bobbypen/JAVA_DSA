package assignment_3;

public class Q_19_1 {

	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = {2,2,3,1,3,2,1,1};
			int n = arr.length;
			
			sort(arr);
			
			major(arr,n);
			
		}
		
		
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
		
		
		public static void major(int [] arr,int n) {
			int first = 0;
			int second = 0;
			int c1 = 0;
			int c2 = 0;
		 
			for (int i = 0; i < arr.length; i++) {
				
				if (first == arr[i]) {
					c1++;
				} else if(second == arr[i]) {
					c2++;
				}else if(c1 == 0) {
					c1++;
					first = arr[i];
				}else if (c2 == 0) {
					c2++;
					second = arr[i];
				}else {
					c1--;
					c2--;
				}
			}
			
			c1=0;
			c2=0;
			for (int i = 0; i < arr.length; i++) {
				if (first == arr[i]) {
					c1++;
				} else if(second == arr[i]) {
					c2++;
			}
			}
			if (c1>n/3 && c2>n/3) {
		    System.out.println(first);

			System.out.println(second);
			}else {
				System.out.println("no majority element");
			}
			}
		
}

