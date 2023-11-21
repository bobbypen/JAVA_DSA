package assignment_4;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[n][n];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		
		rotate(arr);
	}
	
	
	public static void rotate(int [] [] arr) {
		
		for (int col = arr[0].length-1; col >=0; col--) {
			for (int row = 0; row < arr.length; row++) {
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	
	}

}

