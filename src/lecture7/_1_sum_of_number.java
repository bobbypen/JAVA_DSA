package lecture7;
import java.util.Scanner;
public class _1_sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sum_of_number(n);
		
	}
	
	public static void sum_of_number(int n ) {
		
		int sum = 0;
		int i = 0;
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
	}

}
