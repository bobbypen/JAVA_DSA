package assignment_4;

import java.util.Scanner;

public class Q_17 {

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
			maxsum(arr);

		}
		
		public static void maxsum(int [] [] arr) {
			int ans = 0;
	       int count = 0;
			for (int col = 0; col < arr[0].length; col++) {
				
				int prev = 0;
				for (int row = 0; row < arr.length; row++) {
					
					prev = prev + arr[row][col];
					if (ans<Math.max(ans, prev)) {
						count = col;
					}
					ans = Math.max(prev, ans);
				
//				System.out.print(count + " ");
			}
			
		}
		System.out.println(count+1 + " " + ans);
	}
	

}
