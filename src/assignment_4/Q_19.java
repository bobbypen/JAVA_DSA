package assignment_4;
import java.util.*;
public class Q_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// solution in amin copy of notes 
		//for upper tri.. jaha vhi row >col hoga waha wah pr 0 print kr denge 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] [] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		triangular(arr);
	}
	public static void triangular(int[][]arr) {
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (row>col) {
					System.out.print("0" + " ");
					
				} else {
					System.out.print(arr[row][col]+ " ");
					
				}
			}
			System.out.println();
		}
	}
}
