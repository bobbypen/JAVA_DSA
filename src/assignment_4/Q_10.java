package assignment_4;
import java.util.*;
public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] [] arr = new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.println(matrix(arr));
		
	}
	public static boolean matrix(int arr [][]) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				if (row<col) {
					if(arr[row][col] == 0) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		return true;
	}

}
