package lecture19;

public class _6_Pow_of_N_Recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int pow = 5;
		System.out.println(pow(a,pow));
		
	}
public static int pow(int a, int pow) {
	if (pow == 1) {
		return a;
	}
	
	int n = pow(a,pow-1);
	return n * a;
}
}
