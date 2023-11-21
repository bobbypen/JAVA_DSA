package assignment_1;

public class Q_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 0;
		int star = 1;
		int n = 6;
		while(row<n) {
			int i = 0;
			int val = 1;
			while(i<star) {
				
				System.out.print(val + "\t");
				val = ((row-i)*val)/(i+1);
				i++;
				
			}
			
		row++;
		star++;
		System.out.println();
		}
		
	}

}
