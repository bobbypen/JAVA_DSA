package lecture18;
import java.util.*;
import java.util.Iterator;

public class _9_Diagonal_traverse {

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
