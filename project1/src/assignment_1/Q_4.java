package assignment_1;
import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int count = 1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print(count + "\t");
				i++;
				count++;
			}
			row++;
			
			star++;
			System.out.println();
		}
	}

}
