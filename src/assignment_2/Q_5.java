package assignment_2;
import java.util.Scanner;
public class Q_5 {
//print series
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n = 1;
		int i = 1;
		
		while(i<=n1) {
			if((3*n+2)%n2 != 0) {
				System.out.println(3*n+2);
				i++;
			}
			n++;
			
		}
		
	}

}
