package lecture3;
import java.util.Scanner;
public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int pattern = 1;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			int count = 1;
			int k = 1;
			while(k<=pattern) {
				System.out.print(count + " ");
				k++;
				count++;
			}
			row++;
			pattern+=2;
			space--;
			System.out.println();
		}
	}

}
