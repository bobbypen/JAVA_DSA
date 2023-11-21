package assignment_4;
import java.util.*;
public class Q_11 {

		   public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t>0) {
					long n = sc.nextLong();
					int k = sc.nextInt();
					
					
					System.out.println(kthroot(n,k));
					t--;
				}
			}
			
			public static int kthroot(long n, int k) {
				int low = 0;
				long high = n;
				int ans = 0;
				while(low<=high) {
					int mid = (int) ((low+high)/2);
					if(Math.pow(mid,k)<=n) {
						ans = mid;
						low = mid+1;
					}else {
						high = mid-1;
					}
				}
				return ans;
			}
			
			
		}
