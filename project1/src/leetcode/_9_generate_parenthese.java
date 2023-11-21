package leetcode;
import java.util.*;
public class _9_generate_parenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		List<String> ll = new ArrayList<>();
		GeneratePare(n,0,0,"",ll);
		System.out.println(ll);
	}
	
	public static void GeneratePare(int n, int open,int close,String ans,List<String> ll) {
		if (open==n && close == n) {
//			System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		if (open<n) {
			GeneratePare(n,open+1,close,ans+ "(",ll);
		}
		if (close<open) {
			GeneratePare(n,open,close+1,ans+ ")",ll);
		}
		
		
	}

}
