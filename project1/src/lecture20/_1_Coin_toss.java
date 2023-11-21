package lecture20;

public class _1_Coin_toss {

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
		
		
		COINtoss(n-1,ans+"H");
		COINtoss(n-1,ans+"T");
		
	}

}
