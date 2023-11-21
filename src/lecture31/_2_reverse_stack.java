package lecture31;

import java.util.Stack;

public class _2_reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
			
		
		System.out.println(st);
		
		reverse(st);
		System.out.println(st);
	}
	
	
	public static void reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
		
			return;
		}
		
		int x = st.pop();
		reverse(st);
		AddElem(st,x);
		
	}
		
		
		
	
	public static void AddElem(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int x = st.pop();
		AddElem(st,item);
		st.push(x);
	}


}
