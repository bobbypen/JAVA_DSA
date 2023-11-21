package lecture30;
import java.util.*;
public class Stack_java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_ st = new Stack_();
		System.out.println(st.peek());
	
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		st.Display();
	}

}
