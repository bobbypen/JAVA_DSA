package assignment_1;
import java.util.Scanner;
public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
			System.out.print("*");
			i++;
			}
			row++;
			star++;
			System.out.println();
		}
	}

}
