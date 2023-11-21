package assignment_3;
import java.util.*;
public class Q_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		binary(arr);
	}
	public static void binary(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int mul = 1;
			while(arr[i]>0) {
				int rem = arr[i] % 10;
				sum = sum + rem * mul;
				arr[i] = arr[i]/10;
				mul = mul * 2;
			} 
			System.out.println(sum);
		}
	}
}
