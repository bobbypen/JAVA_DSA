package a_pattern;

public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while (i<=star) {
				
			System.out.print("*");	
				i++;
			}
			
			System.out.println();
			row++;
			star--;
		}
	}

}
