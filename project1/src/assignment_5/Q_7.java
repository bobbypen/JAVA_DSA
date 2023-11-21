package assignment_5;
import java.util.*;
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		asc(str);
	}
	public static void asc(String str) {
		for (int i = 0; i < str.length()-1; i++) {

		
		int a = str.charAt(i+1) - str.charAt(i);
		System.out.print(str.charAt(i));
		System.out.print(a);
		
//			
		}
		System.out.print(str.charAt(str.length()-1));
	}
}
