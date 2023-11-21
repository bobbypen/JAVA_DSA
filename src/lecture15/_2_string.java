package lecture15;

public class _2_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String ("hello");
		System.out.println(str1==str3); // comparing address
		System.out.println(str1==str2);
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		
		
		
		String s1 = "hey";
		String s2 = "bey";
		String s = s1+s2;
		System.out.println(s1);
		System.out.println(s);
		String ss = s1.concat(s2);
		System.out.println(ss);
		
		System.out.println(str1.equals(str3)); // to compare content
		
		System.out.println(equals(s1,s2));
		
		System.out.println(s1.indexOf('h'));
		
	}
	
	public static boolean equals(String s1, String s2) {
		if(s1==s2) {
			return true;
		}
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	

}
