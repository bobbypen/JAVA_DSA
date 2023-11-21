package assignment_1;
import java.util.Scanner;
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int count = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				if(row<=n/2) {
				System.out.print(count + " ");
				}else if(i==1 || i==star) {
					System.out.print(count + " ");
				}else {
					System.out.print("0 ");
				}
				i++;
				
			}
			count++;
			row++;
			star++;
			System.out.println();
		}
	}

}
