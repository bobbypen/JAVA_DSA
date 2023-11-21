package lecture3;
import java.util.Scanner;
public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int pattern = 1;
		int space = n-1;
		int count = 0;
		
		while(row<=n) {
//			System.out.print(count);
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			
			
			int j=1;
		
			while(j<=pattern) {
				
				
				if(j<= (pattern+1)/2) {
					count++;
				}else {
					count--;
					
					
				}
				System.out.print( count +" ");
				
				j++;
				
			}
			
			row++;
			space--;
			pattern+=2;
			System.out.println();
		}
	}

}
