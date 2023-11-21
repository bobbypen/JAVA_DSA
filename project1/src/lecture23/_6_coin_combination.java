package lecture23;

public class _6_coin_combination {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {2,3,5,6};
		int amt = 10;
		print(coin,amt,"",0);
		
	}
	
	
	public static void print(int[] coin,int amt, String ans,int idx) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			if (amt>=coin[i]) {
				print(coin,amt - coin[i],ans+coin[i],i);
			}
		}
	}

}
