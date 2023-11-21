package assignment_1;
import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space  = n-1;
		while(row<=n) {
			
			//space
			int i = 1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			
			//star
			int j = 1;
			if(row==1 || row==n) {
			while(j<=star) {
				System.out.print("*");
				j++;
			}
			}else {
				System.out.print("*");
			}
			
			//space
			int k = 1;
			while(k<=n/2+1) {
				if(row==1 || row ==n) {
					k++;
				}else
				{
				System.out.print(" ");
				k++;
				}
			}
			int l = 1;
			while(l<=1) {
				if(row==1 || row==n) {
					l++;
				}else {
					System.out.print("*");
					l++;
				}
			}
			space-=1;
			row++;
			System.out.println();
			
		}
	}
	
	}




