package assignment_1;
import java.util.Scanner;
public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2*n-3;
		
		while(row<=n) {
			int count = 1;
			int i = 1;
			while(i<=star) {
				System.out.print(count);
				i++;
				count++;
			}
			int j = 1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			
			if(row==n) {
				k++;
			}
			while(k<=star) {
				if(row==n&&k==2) {
					count-=2;
					
				}else {
					count--;
				}
				
				System.out.print(count);
				k++;
				
			}
			row++;
			star++;
			space-=2;
			System.out.println();
		}
		
		
	}

}
