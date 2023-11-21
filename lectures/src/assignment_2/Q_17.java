package assignment_2;
import java.util.Scanner;
public class Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int car_1 = sc.nextInt();
		int car_2 = sc.nextInt();
		int car_1_odd = 0;
		int car_1_Even = 0;
		int car_2_odd = 0;
		int car_2_Even = 0;
		int pos = 1;
		int check = 0;
		int i = 1;
		int rem_1 = 0;
		int rem_2 = 0;
		
		while(car_1>0) {
			rem_1 = car_1%10;
			rem_2 = car_2%10;
			
			
		if(rem_1%2==0 ) {
			car_1_Even = car_1_Even + rem_1;

		}else {
			car_1_odd = car_1_odd + rem_1;
		}
		
		if(rem_2%2==0 ) {
			car_2_Even = car_2_Even + rem_2;
		}else {
			car_2_odd = car_2_odd + rem_2;
	
		}
		
		
		
		
		car_1 =  car_1/10;
		car_2 =  car_2/10;
		pos++;
		
		}
		
		if(car_1_Even % 4 == 0 || car_1_odd % 3 ==0 ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

		if(car_2_Even % 4 == 0 || car_2_odd % 3 ==0 ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}	
	}
}


