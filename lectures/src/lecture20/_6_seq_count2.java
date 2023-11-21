package lecture20;

public class _6_seq_count2 {

static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		print(ques,"");
			print(ques , "");
		System.out.println(count);
	}
	
	public static void print(String ques,String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		print(ques.substring(1),ans);
	print(ques.substring(1),ans+ch);
		
	}
	
}
