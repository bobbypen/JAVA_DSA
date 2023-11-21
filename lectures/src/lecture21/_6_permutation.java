package lecture21;

public class _6_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		print(ques,"");
	}
public static void print(String ques,String ans) {
	if (ques.length()==0) {
		System.out.println(ans);
	return;
	}
	
	for (int i = 0; i < ques.length(); i++) {
		
		String ros = ques.substring(0,i)+ ques.substring(i+1);
		char c = ques.charAt(i);
		print(ros,ans+c);
	}
	
	
}
}
