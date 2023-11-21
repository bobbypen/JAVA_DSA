package lecture7;

public class fun_with_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 6;
		int b = 9;
		add(a,b);
		System.out.println("bye");
		

	}
		public static void add(int a , int  b ) {
			int c = a+b;
			sub(a,c);
			System.out.println(c);
		}
		public static void sub(int a , int b ) {
			int c = a-b;
			
			System.out.println(c);
		}
	

}
