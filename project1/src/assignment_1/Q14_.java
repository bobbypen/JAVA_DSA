package assignment_1;

public class Q14_ {

	public static void main(String args[]) {
		
		int n = 5;
		int c = n;
		int star = 1;
		int row = 1;
		int space = 2*n-1;
		
		
		while (row<=n*2+1) {
			
			int count = n;
			int cf = c;
			
			int i = 1;
			if (row == n+1) {
				i++;
			}
			while (i<=star) {
				System.out.print(count + " ");
				i++;
				
				count--;
			}
		
			int j = 1;
			while (j<=space) {
				System.out.print(" " + " ");
				j++;
				
			}
			
			int k = 1;
			
			while (k<=star) {
				System.out.print(cf + " ");
				k++;
				cf++;
				
			
			}
			
			
			
			
			if (row<=n) {
				star++;
				space-=2;
				c--;
			}else {
				star--;
				space+=2;
				c++;
			}
		row++;
		
		
		System.out.println();
		}
	}
}
