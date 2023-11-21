package assignment_1;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = -1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			int j =1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int l =1;
			if(row==1 || row == 2*n-1) {
				l++;
			}
			while(l<=star) {
				System.out.print("*");
				l++;
			}
			
			if(row<5) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			row++;
			
			System.out.println();
		}
		
	}

}
