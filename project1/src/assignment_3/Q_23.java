package assignment_3;
import java.util.*;
public class Q_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0) {
			int n = sc.nextInt();
			int arr[] = new int [n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			next_pre(arr,n);
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " "); 
			}
			
			
			System.out.println();
			t--;
		}
	}
	public static void next_pre(int [] arr, int n ) {
		
		int index = -1;
		for (int i = n-2; i  >=0; i--) {
			if (arr[i]<arr[i+1]) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			reverse(arr,0,n-1);
			return;
		}
		int index2 = -1;
		for (int i = n-1; i >=0; i--) {
			if(arr[index]<arr[i]) {
			index2=i;
			break;
		}
		}
	
			int temp = arr[index];
			arr[index] = arr[index2];
			arr[index2] = temp;
			
			reverse(arr,index+1,n-1);
}

public static void reverse(int[] arr , int i ,int j) {

	while(i<j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		i++;
		 j--;
		 
	}
}
	
}
