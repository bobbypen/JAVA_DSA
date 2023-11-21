package a_pattern;
import java.util.*;
public class bjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		while (t>0) {
			int item = sc.nextInt();
			System.out.println(search(arr,item));
			t--;		
		}
		
		
	}
	
	
	public static int search(int [] arr,int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
