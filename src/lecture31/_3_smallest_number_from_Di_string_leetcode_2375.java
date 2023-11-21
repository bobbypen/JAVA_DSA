package lecture31;

import java.util.*;

public class _3_smallest_number_from_Di_string_leetcode_2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(Smallest_number(str));
	}
	
	public static String Smallest_number(String str) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[str.length()+1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				while (!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
					
				}
			}else {
				st.push(i);
			}
		}
		
		String s = "";
		for (int i = 0; i < ans.length; i++) {
			s = s+ ans[i];
			
		}
		return s;
	}

}
