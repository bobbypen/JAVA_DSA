package assignment_4;
import java.util.*;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int[n][m];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		
		}
		
//		int [][] arr = {{11, 12, 13},
//						{21, 22, 23},
//						{31, 32, 33},
//						{41, 42, 4}};
		
		sprial(arr);

	}
	
	public static void sprial(int [] [] arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int total = arr.length * arr[0].length;
		int count = 0;
		while(count<total) {
		for (int i = minr; i <= maxc && count<total; i++) {
			System.out.print(arr[minr][i]+ ", ");
		count++;
		}
		minr++;
		
		for (int i = minr; i <= maxr && count<total; i++) {
			System.out.print(arr[i][maxc] + ", ");
		count++;
			
		}
		maxc--;
		
		for (int i = maxc; i >= minc && count<total; i--) {
			System.out.print(arr[maxr][i] + ", ");
		count++;
		}
		maxr--;
		
		for (int i = maxr; i >=minr && count<total; i--) {
		System.out.print(arr[i] [minc] + ", ");	
		count++;
		}
		minc++;
		
}
		System.out.println("END");
	}
}