package a_pattern;

public class Q_8_aaignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int n = 4;
//		int c = 0;
		int space = n*2-3;
		int row = 1;
		
		int star = 1;
		while (row<=n) {
			
		
			int count = 1;
			int i = 1;
			while (i<=star) {
				System.out.print(count);
				i++;
				count++;
			}
			
			int j = 1;
			while (j<=space) {
				System.out.print(" ");
				j++;
			}
			
			int k = 1;
			if (row==n && k ==1) {
				k++;
				count--;
			}
			while(k<=star) {
				count--;
				System.out.print(count);
				k++;
				
			}
		
		row++;
		
		star++;
		space-=2;
		System.out.println();
	}
		}
		
}
	

