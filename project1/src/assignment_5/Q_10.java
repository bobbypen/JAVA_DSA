package assignment_5;
import java.util.*;
public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //"aabccba"
		dub(str);
	}
public static void dub(String str) {
	
	for (int i = 0; i < str.length()-1; i++) {
		
		
		if (str.charAt(i) != str.charAt(i+1)) {
			System.out.print(str.charAt(i));
		}
		
		
	}
	System.out.println(str.charAt(str.length()-1));
}
}
