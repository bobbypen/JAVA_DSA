package lecture7;

public class Function_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		add();
		System.out.println("bye");
		
	}

	public static void add() {
		int a = 45;
		int b = 24;
		int c = a + b;
		sub();
		System.out.println(c);
	}
	
	public static void sub() {
		int a = 10;
		int b = 15;
		int c = a - b;
		System.out.println(c);
	
	}
}
