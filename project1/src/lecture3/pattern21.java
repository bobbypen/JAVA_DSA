package lecture3;
import java.util.Scanner;
public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n*2-3;
		while(row<=n) {
			//star------------
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space-----------
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			if( row ==  n) {
				k++;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			space-=2;
			star++;
			row++;
			System.out.println();
		}
	}

}
