package assignment_4;
import java.util.*;
public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [] [] arr = new int[m] [n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i] [j] = sc.nextInt();
				
			}
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
			System.out.print(arr[i] [j] + " ");
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void sort(int [] [] arr) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
	}

}
