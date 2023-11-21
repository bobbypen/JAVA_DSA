package lecture7;

public class Function_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 9;
		add(a,b);
		add(5,4);
		System.out.println("bey");
		
	}

	public static void add(int a, int b ) { // value under para can be same or different
		
		int c = a+b;
		System.out.println(c);
		
	}
}
