package assignment_4;
import java.util.*;
public class Q_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		
		int [] stall = new int[nos];
		
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		
		System.out.println(min(stall,noc));
		
		
		
	}
	public static int min(int stall[] ,int noc) {
		
	
		// hum binary search lagyenge aki minimum lagest nikal ske 
		int low = stall[0];
		int high = stall[stall.length-1];
		int ans = 0;
		while(low<=high) {
		int mid = (low+high)/2;
		if(isafe(stall,noc,mid)==true) {
			ans = mid;
//			agr condtion true h or is midian pr cow set h toh aage dekhnge agla number by increase low
			low = mid+1;
		}else {
				high = mid-1;
			}
		}
		return ans;
	
	}

	
		public static boolean isafe(int stall [] ,int noc,int mid) {
			
			int cow = 1;
			int pos = stall[0];
			for (int i = 1; i < stall.length; i++) {
				if(stall[i]-pos>=mid) {	
					cow++;
					pos = stall[i];
				}
			
			if (noc == cow) {
				
				return true;
			}
			}
			return false;
			
		}
}
