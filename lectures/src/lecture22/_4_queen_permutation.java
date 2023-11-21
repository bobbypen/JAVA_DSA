package lecture22;
import java.util.*;
public class _4_queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean [] arr = new boolean [4]; //by deafult false fill hoga 
		int n = 2; //number of queen
		print(arr,n,0,"");
		
		
	}
	public static void print(boolean [] board,int tq , int qpsf,String ans) {
//		tq _> total queen 
//		qpsf ->  queen place so far
		if (tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
		print(board,tq,qpsf+1, ans+"b" + i + "q"+qpsf+" ")	;	
//		board[i] = false;
		
			
} 
	

		
		
	}
	
	
	}}
