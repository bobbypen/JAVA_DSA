package lecture3;
import java.util.Scanner;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row  = 1;
		int pattern = 1;
		int space =  n-1;
		int count = 1;
		while(row<=n) {
			int k = 1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			
			int i = 1;
			while(i<=pattern) {
				System.out.print(count + " "  );
				i++;
				
			
		}
			row++;
			pattern+=2;
			space--;
			count++;
			System.out.println();
		}
	}

}
