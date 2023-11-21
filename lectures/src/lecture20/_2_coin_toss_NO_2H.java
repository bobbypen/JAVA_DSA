package lecture20;

public class _2_coin_toss_NO_2H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		COINtoss(n,"");
	}
	
	public static void COINtoss(int n,String ans) {
		if (n==0) {
			System.out.println(ans+" ");
			return;
		}
		
		if (ans.length()==0||ans.charAt(ans.length()-1) != 'H') {
			
		
		COINtoss(n-1,ans+"H");
		}
		COINtoss(n-1,ans+"T");
	}
}