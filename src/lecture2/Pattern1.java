package lectures2;

import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = a+b;
//		System.out.println(c);
//		
		
		
		//printing 5 star in row 
		
		// Output
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * *
		
		
		int n = sc.nextInt();
		int star = n;
		int row = 1;
		
		while(row<=n) {
			
			int i = 1 ;
			while(i<=n) {
				System.out.print("* ");
				i++;
			}
			
			System.out.println();
			row++;
		}
		
		
		
		
		
		
	}

}
