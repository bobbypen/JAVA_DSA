package lecture32;

import java.util.*;

public class _84_histrogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		84. Largest Rectangle in Histogram

		int arr[] = { 2, 1, 5, 6, 2, 3 };

		System.out.println(Area(arr));
	}

	public static int Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
				int h = arr[st.pop()];
				if (st.isEmpty()) {

				} else {
					int r = i;
					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}

			}

			st.push(i);

		}
		int r = arr.length;

		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {

				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}

		}

		return ans;

	}
}
