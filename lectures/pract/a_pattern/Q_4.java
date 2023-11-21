package a_pattern;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while (i<=n) {
				
				if (i<=space) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				i++;
			}
			System.out.println();
			row++;
			space--;
			
			
			
		}
		
		
	}

}
