package assignment_5;

import java.util.Scanner;

public class Q_21 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t>0) {
			String a = sc.next();
			String b = sc.next();
			
			for (int i = 0; i < a.length(); i++) {
				int c =  (a.charAt(i)^b.charAt(i));
				System.out.print(c);
				
			}
			t--;
			System.out.println();
			}
			
		}

	}