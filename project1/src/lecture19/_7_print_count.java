package lecture19;

public class _7_print_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		count(n);
	}
public static void count(int n ) {
	if (n==0) {
		return ;
	}
	System.out.println(n); // try both
	count(n-1);
//	
	System.out.println(n);
}
}
