package assignment2;
import java.util.*;
public class Q_1 {

		// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		print(a,count);
	}
public static void print(int a, int count) {
	int odd = 0;
	int even = 0;
	while (a>0) {
		count = count +1;
		int rem = a%10;
		if (count%2!=0) {
		odd = odd + rem;
		} else {
			even = even + rem;
		}
		a= a/10;
	}
	
	System.out.println(odd);;
	System.out.println(even);
}
}
