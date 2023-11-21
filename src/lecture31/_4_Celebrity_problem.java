package lecture31;
import java.util.*;
public class _4_Celebrity_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://leetcode.ca/all/277.html
		
		int [][] arr = {{0,1,1,1},
				{1,0,1,1},
				{0,0,0,0},
				{1,1,1,0 }};
		
		System.out.println(celebrity(arr));
		}
		
		public static int celebrity(int [][] arr) {
			
			
			Stack<Integer> st = new Stack<>();
			for (int i = 0; i < arr.length; i++) {
				st.push(i);
			}
			
			
			while (st.size()>1) {
				int a = st.pop();
				int b = st.pop();
				if (arr[a][b] ==1) {
					st.push(b);
				}else {
					st.push(a);
				
			}
						
		}
	
			int candidate = st.pop();
			for (int i = 0; i < arr.length; i++) {
				if (arr[candidate] [i] == 1 || arr[i] [candidate] ==0) {
					return -1;
				}
			}
		
		return candidate;
	}

}
