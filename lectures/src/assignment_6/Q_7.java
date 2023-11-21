package assignment_6;

public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		print(n,0,0,"");
		
	}
	public static void print(int n , int open, int close , String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		
		
		if (close<open) {
			
			print(n,open,close+1,ans + ")");
		}
		
		if (open<n) {
	
		print(n,open+1,close, ans+"(");
		}
		
	}
	
	
}
