package assignment_5;

public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcsd";
		com(str);
	}
public static void com(String str) {
	int count = 0;
	for (int i = 0; i < str.length()-1; i++) {
		
		if (str.charAt(i)==str.charAt(i+1)) {
			count++;
		} else if (str.charAt(i)==str.charAt(i-1)) {
			count++;
			System.out.print(str.charAt(i) );
			System.out.print(count);
			
			count = 0;
		} else if(str.charAt(i)!=str.charAt(i+1)||str.charAt(i)!=str.charAt(i-1)) {
			System.out.print(str.charAt(i));
		
	}
	
	}
	
}}
