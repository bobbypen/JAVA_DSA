package lecture17;

public class _3_check_set_or_not_set {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 68;
		int i = 3;
		
		System.out.println(Isset(n,i));
		
	}

	public static int Isset(int n , int i) {
		int mask = (1<<i);
		if((n&mask) != 0) {
			return 1;
			
		}else {
			return 0;
		}
	}
		
}
