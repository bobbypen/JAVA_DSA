package assignment_5;
import java.util.*;
public class Q_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		System.out.println(sub(a));
	}
	
	public static int sub(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
			String c =	s.substring(i,j);
			if (pall(c) == true) {
				count++;
			}
			}
			
		}
		return count;
		
	}
	
	
	
	public static boolean pall(String s) {
		int i = 0;
		int j = s.length()-1;
		while (i<j) {
			if (s.charAt(i) == s.charAt(j)) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}

}
