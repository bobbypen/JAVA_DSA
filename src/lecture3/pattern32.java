package lecture3;
import java.util.Scanner;
public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int pattern = 1;
		int count = 1;
		while(row<=n*2-1) {
			int i = 1;
			while(i<=pattern) {
				if(i%2==0) {
					System.out.print("* ");
				}else {
					System.out.print(count + " ");
				}
				i++;
			}
			if(row<n) {
				count++;
				pattern+=2;
			}else {
				count--;
				pattern-=2;
			}
			
			row++;
			
			System.out.println();
		}
	}

}
