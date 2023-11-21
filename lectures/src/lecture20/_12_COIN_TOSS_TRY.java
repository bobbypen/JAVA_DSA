package lecture20;

public class _12_COIN_TOSS_TRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		print(n,"");
		
		
	}
	
	public static void print(int n , String ans) {
		if (n==0) {
			System.out.println(ans);
			 return;
		}
		
		print(n-1,ans+'H');
		print(n-1,ans+'T');
		
		
	}

}
