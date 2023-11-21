package assignment_5;
import java.util.*;
public class Q_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(pall(s));
	}
	public static boolean pall(String s) {
		int i = 0;
		int j = s.length()-1;
		while (i<j) {
			if (s.charAt(i)==s.charAt(j)) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
}
