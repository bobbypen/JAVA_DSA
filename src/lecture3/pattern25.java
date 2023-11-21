package lecture3;
import java.util.Scanner;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space =   n-1 ;
		int count = 1;
		int pattern = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("\t");
				i++;
				
			}
			int j = 1;
			while(j<=pattern) {
				System.out.print(count + "\t" );
				j++;
				count++;
			}
		row++;
		pattern+=2;
		space--;
		System.out.println();
		}
	}

}
