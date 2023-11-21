package lecture24;
import java.util.*;
public class _1_palidrome_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<String>();
		List<List<String>> ans = new ArrayList<>();
		print(ques, ll, ans);
		System.out.println(ans);
	}
	
	static void print(String ques, List<String> ll, List<List<String>> ans) {
		if(ques.length()==0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));	//If we dont create new arrayList then it would make changes on the existing address, hence we copied the data to other address
			return;
		}
		for(int i=1; i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(Pallindromic(s)) {
				ll.add(s);
				print(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
			
		}
	}
	
	public static boolean Pallindromic(String s) {
		int i=0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}