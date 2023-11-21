package lecture32;

import java.util.Stack;

public class _2_Stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {30,35,40,38,35};
		colspan(arr);
		
	}
	
	public static void colspan(int [] arr) {
		
			Stack<Integer> st = new Stack<>();
			int[] ans = new int[arr.length];
			
			for (int i = 0; i < ans.length; i++) {
				while (!st.isEmpty() && arr[i]>arr[st.peek()]) {
					st.pop();
				}
				
				if (st.isEmpty()) {
					ans[i] = i+1;
				}else {
					ans[i] = i - st.peek();
				}
				st.push(i);
	}

			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + " ");
			}
			
			
}
}