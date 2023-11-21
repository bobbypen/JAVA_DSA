package lecture3;

public class pattern33_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int space = n-1;
		int star = 1;
		int row = 1;
		
		int count = n;
		while (row<=n) {
			int nu = count;
			int i = 1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while (j<=star) {
				if (j==((star+1)/2)) {
				System.out.print(0+" ");	
				}else {
				System.out.print(nu + " ");
				}
				
				if (j<((star+1)/2)) {
					nu++;
					
				}else {
					nu--;
				}
				j++;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			count--;
			
			row++;
			space--;
			star+=2;
			System.out.println();
		}
	}

}
