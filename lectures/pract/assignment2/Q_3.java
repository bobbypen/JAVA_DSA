package assignment2;

public class Q_3 {

	public static void main(String args[]) {
		
		int n1 = 10;
		int n2 = 4;
		print(n1,n2,1,1);
		
	}
	
	public static void print(int n1 ,int n2,int n,int i) {
		
		if (i == n1) {
			return;
		}

		if (((3*n+2)%n2)!=0) {
			System.out.println(3*n+2);
			i++;
		}
		print(n1, n2, n+1, i);
}
}
