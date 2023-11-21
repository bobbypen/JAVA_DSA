package lecture30;

public class Stack1_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack1 st = new Stack1(10);
		
		
		
		System.out.println(st.peek());
		st.push(10);
		st.push(20);
		st.push(30);
		st.Display();
		
		System.out.println(st.pop());
		st.Display();
	
		System.out.println(st.peek());
		st.Display();
		System.out.println(st.isEmpty());
	}

}
