package assignment2;

import java.util.Scanner;
import java.util.*;
public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t	= sc.nextInt();
		
		print(a,t,0);
	}
public static void print(int a,int t,int count) {
	if (a == 0) {
		System.out.println(count);
		return;
	}
	
	
	
	int rem = a%10;
	if (rem==t) {
		count++;
	}
	
	print(a/10, t, count);
}
}
