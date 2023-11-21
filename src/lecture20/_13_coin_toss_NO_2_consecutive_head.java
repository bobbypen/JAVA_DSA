package lecture20;

public class _13_coin_toss_NO_2_consecutive_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		print(n,"");
		
	}   
	
	public static void print(int n , String ans) {
		if (n==0) {
			System.out.println(ans);
			return;
		}
		
		if (ans.length()==0|| ans.charAt(ans.length()-1)!='H') {
			print(n-1,ans+'H');
		}
		print(n-1,ans+'T');
		
		
	}

}
