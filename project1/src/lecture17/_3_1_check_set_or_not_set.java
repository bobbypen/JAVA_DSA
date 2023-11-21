package lecture17;

public class _3_1_check_set_or_not_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 86;
		int pos = 2;
		System.out.println(isset(x,pos));
	}
	
	public static boolean isset(int x, int pos) {
		x = x>>pos;
		if ((x&1)==1) {
			return true;
		}else {
			return false;
		}
	}

}
