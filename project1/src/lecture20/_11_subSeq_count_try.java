package lecture20;

public class _11_subSeq_count_try {

	public static void main(String[] args) {

		String str = "abc";
		System.out.println(print(str,""));
		
		
		
}
	
	public static int print(String st, String ans) {
		if (st.length()==0) {
			System.out.println(ans);
			return 1;
		}
		
		char c = st.charAt(0);
		int f1 = print(st.substring(1),ans);
		int f2 = print(st.substring(1),ans+c);
		return f1+f2;
	}
	
}
