package lecture20;

public class _10_subseq_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		print(str,"");
		
		
	}
	
	public static void print(String str, String ans ) {
		
		if (str.length()==0) {
			System.out.println(ans);
			return;
		}	
		
		char c = str.charAt(0);
		print(str.substring(1),ans);
		print(str.substring(1),ans+c);
	}

}

