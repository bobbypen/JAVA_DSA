package lecture4;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3467;
		int sum = 0;
//		while(n>0) {
//			int rem = n%10;
//			sum = sum + rem;
//			n = n/10;
//		}
//		System.out.println(sum);
	



// By for loop

for(int i=1;i>0;i++) {
	int rem = n%10;
	 sum = rem + sum;
	 n = n/10;
	
	
}
System.out.println(sum);
}
}