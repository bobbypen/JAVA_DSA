package lecture20;

public class _31_board_path_try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n,0,"");
		
	}
public static void print (int end,int curr,String ans) {
	if (curr == end) {
		System.out.println(ans);
		return;
	}
	if (curr>end) {
		return;
	}
	
	print(end,curr+1,ans+1);
	print(end,curr+2,ans+2);
	print(end,curr+3,ans+3);
}
}
