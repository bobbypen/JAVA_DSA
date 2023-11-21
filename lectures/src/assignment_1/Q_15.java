package assignment_1;

public class Q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int c = n;
		
		int star = 2*n+1;
		int row = 1;
		int space = 0;
		while (row<=n*2+1) {
			int cc = c;
			int  j = 1;
			
			
			while (j<=space) {
				System.out.print("  ");
				j++;
			
			}
//			System.out.println(cc);
			int i = 1;
			while (i<=star) {
				System.out.print(cc + " ");
				i++;
				if (i<=(star+1)/2) {
					cc--;
				}else {
					cc++;
				}
			}
			
			
		if (row < n+1) {
			star-=2;
			space++;
			c--;
		}else {
			star+=2;
			space--;
			c++;
		}
		
		row++;
		
		
		System.out.println();
		}
	}

}
