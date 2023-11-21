package assignment_2;
import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int even = 0;
		int odd = 0;
		int pos = 1;
		while(n>0) {
			 if(pos%2==0) {
			int rem=n%10;
			even = even + rem;
			n = n/10;
			 }else
			 {
				 int rem=n%10;
					odd = odd + rem;
					n = n/10;
			 }
			 pos++;
			i++;
			
		}
		System.out.println(odd);
		System.out.println(even);
	}

	}
	
