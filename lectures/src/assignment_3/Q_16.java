package assignment_3;
import java.util.*;
public class Q_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//insertion

	public static void sort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];
			int j = i-1;
			while (j>=0 &&arr[j]>picked) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = picked;
		}
	}
}
