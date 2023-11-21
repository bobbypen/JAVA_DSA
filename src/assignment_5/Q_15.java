package assignment_5;
import java.util.*;
public class Q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(uni(arr));
		
	}
	
	public static int uni(int[] arr) {
		
		int ans = 0;
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int count = 0;
			while (a>0) {
				if ((a&1)==1) {
					count++;
					
				}
				a = a>>1;
		if (count>ans) {
			ans = count;
		}
			}
			
			if (count<ans) {
				s=arr[i];
			}
		}
		
		return s;
		
	}}
