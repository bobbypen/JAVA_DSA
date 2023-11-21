package assignment_4;
import java.util.*;
public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int [][] arr = {{11, 12, 13, 14},
//						{21, 22, 23, 24},
//						{31, 32, 33, 34},
//						{41, 42, 43, 44}};
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [] [] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sprial(arr);
		
	}

public static void sprial(int [][] arr) {
	int minr = 0;
	int minc = 0;
	int maxr = arr.length-1;
	int maxc = arr[0].length-1;
	int total = arr.length*arr[0].length;
	int count = 0;
	
	while(count<total) {
	for (int i = minc; i <=maxr && count<total; i++) {
		System.out.print(arr[i][minc] + ", ");
	count++;
	}
	minc++;
	
	for (int i = minc; i <= maxc && count<total; i++) {
		System.out.print(arr[maxr][i] + ", ");
	count++;
		
	}
	maxr--;
	
	for (int i = maxr; i >=minr && count<total; i--) {
		System.out.print(arr[i][maxc] + ", ");
	count++;
	}
	maxc--;
	
	for (int i = maxc; i >=minc && count<total; i--) {
		System.out.print(arr[minr][i] + ", ");
	count++;
	}
	minr++;
}
	System.out.print("END");
}
}
