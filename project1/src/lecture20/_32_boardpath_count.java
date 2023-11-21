package lecture20;

public class _32_boardpath_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(print(n,0,""));
	}
public static int print(int end,int curr,String ans) {
	if (curr==end) {
		System.out.println(ans);
		return 1;
	}
	if (curr>end) {
		return 0;
	}
	
	int f1 = print(end,curr+1,ans+1);
	int f2 = print(end,curr+2,ans+2);
	int f3 = print(end,curr+3,ans+3);
	
	return f1+f2+f3;
}
}
