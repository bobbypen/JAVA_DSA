package assignment_1;
import java.util.Scanner;
public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		int space1 = -1;	
		int count = 1;
	
		while(row<=n) {
		
			
			
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			int j = 1;
			int p = count;
			while(j<=star) {
				
				
				System.out.print(p + " ");
				
				j++;
				p--;
				
				
			}
			
			
			int k = 1;
			while(k<=space1) {
				System.out.print("  ");
				k++;
			}
			int q = 1;
			int o = 1;
			if(row==1 || row==n) {
				q++;
			}
			while(q<=star) {
				System.out.print(o + " ");
				q++;
				o++;
			}
			
			if(row<n/2+1) {
				
				star++;
				space-=2;
				space1+=2;
				count++;
			}else {
				star--;
				space+=2;
				space1-=2;
				count--;
			}
			
			row++;
			System.out.println();
			
		}
		
		
	}

}
