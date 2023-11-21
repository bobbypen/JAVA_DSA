package lecture33;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(Add(2,4));
	System.out.println(Add(2,45,1,2,45,2,1,4,5,55));
	
	}
	
	
	public static int Add(int a ,int b) {
		return a+b;
	}
	
	public static int Add(int a,int b, int c) {
		return a+b+c;
	}
	
	
	public static int Add(float a, int b, int c) {
		return (int) (a+b+c);
	}
	
	public static int Add(int ...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	
}
