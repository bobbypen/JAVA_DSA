package lecture4;
import java.util.Scanner;
public class Checkr_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fact = 0;
		
		// By for loop
		if(n==0||n==1){
			   System.out.println(n+" is not prime number");    
		} else {

		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
			fact++;
			}
			}
		if(fact>=1) {
			System.out.println("this not prime");
		}else {
			System.out.println("this is prime");
		}
		
		
		//by while loop
//		int n = sc.nextInt();
//		int fact = 0;
//		
//		int i = 2;
//		while(i<=n-1) {
//			if(n%i==0) {
//				fact++;
//				
//			}
//			i++;
//		}
//		if(fact>=1) {
//			System.out.println("This is not prime");
//		}else {
//			System.out.println("This is Prime");
//		}
//	
//	
//	
//	
	
	}
	}

}
