package lecture15;

public class _3_String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		lexico Grapically :- compare 2 string konsi badi hain dictionary wise , jaise a chota fir b jo bada hain
//		kamesh
//		komal toh komal badi kuki k ke o

		
		
		
		String s1 = "kunal";
				String s2 = "komal";
				System.out.println(s1.compareTo(s2));
				
				System.out.println(compare(s1,s2));
	}

	
	public static int compare(String s1, String s2) {
		int n = Math.min(s1.length(), s2.length());
		
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
			else if(s1.charAt(i) < s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();
	}
}
