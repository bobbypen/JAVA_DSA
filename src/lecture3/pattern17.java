package lecture3;
import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n/2;
		int space = 1;
		while(row<=n) {
			int i =1 ;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			int j = 1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while(k<=star) {
				System.out.print("*");
				k++;
			}
			if(row<n/2+1) {
			star--;
			space = space+2;}
			else {
				star++;
				space=space-2;
			}
			System.out.println();
			row++;
		}
		
		
	}

}
