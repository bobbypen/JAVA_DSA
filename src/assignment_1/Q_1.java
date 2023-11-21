package assignment_1;
import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n/2+1;
		int row = 1;
		int space = -1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("*" + "\t");
				i++;
			}
			
			int j = 1;
			while(j<=space) {
				System.out.print("  "+ "\t");
				j++;
			}
			
			int k = 1;
			if( row==1 || row==n ) {
				k++;
			}
			
			while(k<=star) {
				System.out.print("*"+ "\t");
				k++;
			}
			
			if(row<n/2+1) {
				space = space + 2 ;
				star--;
			}else {
				space = space - 2 ;
				star++;
			}
			
			
			
			row++;
			System.out.println();
		}
		}
	}


