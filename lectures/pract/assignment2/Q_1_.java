package assignment2;

import java.util.Scanner;

public class Q_1_ {
//recursion
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		print(a,count,0,0);
	}
public static void print(int a, int count,int odd,int even) {
	if (a==0) {
		System.out.println(odd);
		System.out.println(even);
		return;
	}
	
		count = count +1;
		int rem = a%10;
		if (count%2!=0) {
		odd = odd + rem;
		} else {
			even = even + rem;
		}
		int b=a/10;
		print(b,count,odd,even);
	}
	
	
}

