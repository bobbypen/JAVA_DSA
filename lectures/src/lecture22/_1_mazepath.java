package lecture22;

public class _1_mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		print(m-1,n-1,0,0,"");
	}
	
	public static void print(int er,int ec,int cr,int cc,String ans) {
		if (er==cr && ec == cc ) {
			System.out.println(ans);
			return;
		}
		
		if (cr>er || cc>ec) {
			return;
		}
		print(er,ec,cr,cc+1,ans+"H");
		print(er,ec,cr+1,cc,ans+"V");
		
		
		
	}

}
