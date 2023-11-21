package lecture22;

public class _3_Queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// TODO Auto-generated method stub
	int n = 4;
	int tq = 2;
	boolean [] board = new boolean[n];
	combination(board,tq,"",0);
}

public static void combination(boolean[]board,int tq,String ans,int qpsf) {
	if (qpsf == tq) {
		System.out.println(ans);
		return;
	}
	for (int i = 0; i < board.length; i++) {
		if (board[i] == false) {
			board[i] = true;
			combination(board,tq,ans + "b"+i+"q"+qpsf,qpsf+1);
			board[i] = false;
		}
	}
}

}
