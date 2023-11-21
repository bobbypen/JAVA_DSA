package lecture30;

public class Stack_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack_ st = new Stack_();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.Display();
		
		System.out.println(st.pop()); // out of bound kuki limited size diya h
		
		st.Display();
	}

}
