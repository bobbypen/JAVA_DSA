package lecture7;

public class fun_demo {
  static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 5;
		int c = 5;
		System.out.println(val);
		System.out.println(add(a,c));
		add(a,c);
		System.out.println("bye");
		System.out.println(val);
	}
	public static int add(int a , int c) {
		
		int x = a+c;
		System.out.println(x);
		val+=5;
		return x-3;
		
	}

}
