package lecture20;

public class _5_seq_count {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		print(ques,"");
		System.out.println("\n" + print(ques , ""));
		
	}
	
	public static int print(String ques,String ans) {
		if (ques.length() == 0) {
			System.out.println(ans+" ");
			return 1;
		}
		
		char ch = ques.charAt(0);
		int a = print(ques.substring(1),ans);
		int b =print(ques.substring(1),ans+ch);
		return a+b;
	}
	
}
