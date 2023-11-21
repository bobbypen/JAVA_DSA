package lecture3;
import java.util.Scanner;
public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int pattern = n;
		
		while(row<=n) {
			int count = n;
			int i = 1;
			while(i<=pattern) {
				System.out.print(count + " ");
				i++;
				count--;
			}
			
			
			row++;
			System.out.println();
		}
	}

}
