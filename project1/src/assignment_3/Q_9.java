package assignment_3;
import java.util.*;

public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverse(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	
	public static void reverse(int [] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp  = arr[i];
			arr [i] =  arr[j];
			arr [j] = temp;
			
			j--;
			i++;
		}
		
	}

}
