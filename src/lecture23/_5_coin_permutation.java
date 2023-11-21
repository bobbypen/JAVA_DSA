package lecture23;

public class _5_coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {2,3,5,6};
		int amt = 10;
		print(coin,amt,"");
		
	}
	
	
	public static void print(int[] coin,int amt, String ans) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			if (amt>=coin[i]) {
				print(coin,amt - coin[i],ans+coin[i]);
			}
		}
	}

}
