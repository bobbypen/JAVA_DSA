package assignment_1;
import java.util.Scanner;
public class Q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int a = 0;
		int b = 1;
		int star = 1;
		
		
		while(row<=n) {
			int i = 1;
			
			while(i<=star) {
				
				int c=a+b;
				
				System.out.print(a + " ");
				a=b;
				b=c;
				
				i++;
				
				
			}
			
			
			row++;
			star++;
			System.out.println();
			
		}
		
	}

}
