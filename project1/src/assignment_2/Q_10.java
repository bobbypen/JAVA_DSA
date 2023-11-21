package assignment_2;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int divisor = 16;
		int divident = 24;
		int i = 1;
		
		int rem = 0;
		while(divident%divisor>0) {
		  rem = divident%divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor );
			
		}

}
