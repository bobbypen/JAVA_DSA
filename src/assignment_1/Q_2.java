package assignment_1;
import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int count = 0;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  " + "\t");
				i++;
			}
			int k = 1;
			
			while(k<=star) {
				if(k<=star/2+1) {
					count++;
				}else {
					count--;
				}
				System.out.print(count + "\t");
				k++;
				
			}
			
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
