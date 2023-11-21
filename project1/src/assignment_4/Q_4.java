package assignment_4;
import java.util.*;
public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [] [] arr = new int [m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
//		
		int target = sc.nextInt();
//		
		System.out.println(search(arr,target));
		
//		
		
	}
	public static int search(int[][] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i] [j] == target) {
					return 1;
				}
			}
		}
		return 0;
		
	}

}
