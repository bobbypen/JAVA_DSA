package asss1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 17;
		int count = 0;
		int i = 2;
		while (i<num) {
			
			if (num%i==0) {
				count++;
			}
			
			i++;
			
		}
		
		if (count>0) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		

	}

}
