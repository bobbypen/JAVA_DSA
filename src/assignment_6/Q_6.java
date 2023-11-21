package assignment_6;

public class Q_6 {
	static	int coun = 0;
	static	int dice = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board = 3;
		int d = 3;
		dice = d;
		 print(board,0,"");
		 
		 System.out.println("\n" + coun);
		
	}
	
	public static void print(int end,int count,String ans) {
		
		if (count == end) {
			
			
			System.out.print(ans + " ");
			coun++;
			return;
		}
		
		
		if (count>end) {
			return;
		}
		for (int i = 1; i <= dice; i++) {
			
			print(end,count+i,ans+i);
		}
//		print(end,count+2,ans+2);
//		print(end,count+3,ans+3);
//		
		
	}

}
