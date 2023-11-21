package assignment_2;
import java.util.*;
public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		int i =1;
		int rem = 0;
		
		System.out.print("Enter the Digits : ");
		int digit = sc.nextInt();
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		while(digit>0) {
			
			rem = digit%10;
			if(rem==num) {
				count++;
			}
			digit = digit/10;
			
		}
		System.out.println(count);
	}

}
