package lectures2;
import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
			System.out.print("  ");
			i++;
			
			}
		int j = 1;
		while(j<=star) {
			if(j%2==0) {
				System.out.print("! ");//because ! is using on even number and 
			}else 
				System.out.print("* ");// star is on odd number
				
			j++;
		}
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}
}

