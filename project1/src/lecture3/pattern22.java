package lecture3;
import java.util.Scanner;
public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int row = 1;
			int star = n ;
			int space = -1;
			
			while(row<=n) {
				
				//star 
				int i = 1;
				while(i<=star) {
					System.out.print("* "); 
					i++;
				}
				int j = 1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				
				int k = 1;
				if(row==1) {
					
					k++;
				}
				while(k<=star) {
					System.out.print("* ");
					k++;
				}
				row++;
				space+=2;
				star--;
				System.out.println();
			}
			
	}

}
