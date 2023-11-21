
package lecture7;
import java.util.Scanner;
public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(armstrong(n));
		
	}
	
	public static boolean armstrong(int n) {
		int count = countdigit(n);
		int ans = 0;
		int temp = n;
		while(n>0) {
			int rem = n%10;
			ans = (int) (ans + Math.pow(rem, count));
			n=n/10;
		}

		if(ans==temp) {
			return true;
		}else {
			return false;
		}
		}
		
	
	
	public static int countdigit(int n) {
		int count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
