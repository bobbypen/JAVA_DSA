package lecture3;
import java.util.Scanner;
public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int pattern = n;
		int star = n;
		
		while(row<=n) {
			int count = n;
			int i = 1;
			while(i<=pattern) {
				if(i==star) {
					System.out.print("* ");
				}else
				{
				System.out.print(count + " ");
				}
				i++;
				count--;
			}
			
			star--;
			row++;
			System.out.println();
		}
	}

}
