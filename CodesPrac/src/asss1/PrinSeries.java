package asss1;

public class PrinSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 10;
		int n = 1;
		
		int i = 0;
		while (i<num) {
			
		
			
			int ans = 3*n+2;
			if (ans%4==0) {
				
				n++;
			
				continue;
			}else {
				System.out.println(ans);
				n++;
				i++;
			}
			
			
		}
	}

}
