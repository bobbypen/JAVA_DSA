package assignment_3;
import java.util.*;
public class Q_2 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int target = sc.nextInt();
			
			Arrays.sort(arr);
			
			sum(arr,target);
			
		}
		
		public static void sum(int[] arr,int target) {
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					for (int k = j+1; k < arr.length; k++) {
						int sum = arr[i] + arr[j] + arr[k];
						if(sum == target) {
							System.out.println(arr[i]+", "+arr[j]+" and " + arr[k]  );
						}
					}
				}
				
			}
		}
}