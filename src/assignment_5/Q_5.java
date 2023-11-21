package assignment_5;
import java.util.*;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		seq(str);
	}
	public static void seq(String str) {
		
		
		for (int i = 0; i < str.length(); i++) {
			if (i%2==0) {
				char c = str.charAt(i);
				c = (char) (c+1);
				System.out.print(c);
			} else {
				char c = str.charAt(i);
				c = (char) (c-1);
				System.out.print(c);
			}
			
		
		}
	}


}
