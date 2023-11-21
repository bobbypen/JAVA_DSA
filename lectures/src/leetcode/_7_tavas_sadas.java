package leetcode;

import java.util.Scanner;

public class _7_tavas_sadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://codeforces.com/problemset/problem/535/B
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(Index(str));
		
	}
	public static int Index(String str) {
		int n = str.length();
		int count = (1<<n) - 2;
		int pos = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				count += (1<<pos);
			}
			pos++;
		}
		return count+1;
	}
	
}
