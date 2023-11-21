package assignment_6;

public class Q_6_1 {
static int coun = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board = 3;
		int d = 3;
//		dice = d;
		 print(d,board,0,"");
		 
		 System.out.println("\n" + coun);
		
	}
	
	public static void print(int dice,int end,int count,String ans) {
		
		if (count == end) {
			
			
			System.out.print(ans + " ");
			coun++;
			return;
		}
		
		
		if (count>end) {
			return;
		}
		for (int i = 1; i <= dice; i++) {
			
			print(dice,end,count+i,ans+i);
		}
//		print(end,count+2,ans+2);
//		print(end,count+3,ans+3);
//		
		
	}

}

