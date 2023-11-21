package lecture17;

public class _2_Shift_opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 48;
		System.out.println(n>>3);//right shift    n/2^3
		int n1 = -48;
		System.out.println(n1>>3);   
		System.out.println(-5>>1);
		System.out.println(5>>1); //  5/2^1
		System.out.println(-67>>1);
		
		
//		left shift

		int a = 6;
		System.out.println(a<<1);  
		int a1 = 16;
		System.out.println(a1<<1);  // 16*2^1
		
		System.out.println(-6<<1);
		
	}

}
