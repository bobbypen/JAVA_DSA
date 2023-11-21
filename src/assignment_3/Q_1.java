package assignment_3;

import java.util.Scanner;

public class Q_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		inverse(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public static void inverse(int [] arr) {
		int i = 1;
		int j = arr.length-1;
		while(i<j) {
			if (arr[i]!= 0) {
				
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
			j--;
			i++;
		}
	}

}
