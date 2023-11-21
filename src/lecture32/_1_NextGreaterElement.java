package lecture32;
import java.util.*;

public class _1_NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {11,9,13,21,3};
		NGE(arr);
		
	}
	public static void NGE(int [] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
		
	}

}
