package lectures2;
import java.util.Scanner;
public class pattern7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int star = n;
	int space = n-2;
	int row = 1;
	while(row<=n) {
		//humko first or last me total no. of star = n
		if(row==1 || row==n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
		}
		else {
			System.out.print("* ");
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			System.out.print("* ");
		}
		System.out.println();
		row++;
	}
	
	
	
	
	}
}
