package assignment_5;
import java.util.*;
public class Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(max(str));
		
	}
public static char max(String str) {
	
	int ans = 0;
	char a = ' ';
	for (int i = 0; i < str.length(); i++) {
		int count = 0;
		char an = str.charAt(i);
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == str.charAt(i)) {
				count++;
				an = str.charAt(i);
			}
		}
		if (count>ans) {
			ans = count;
			a = an;
			
		}
	}
	return a;
}
}
