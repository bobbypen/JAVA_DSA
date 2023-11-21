package assignment_2;
import java.util.*;
public class Q_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sb = sc.nextInt(); // sb source number system base), 
		int db = sc.nextInt(); //db (destination number system base
		int sn = sc.nextInt();   //sn (number in source format)
		int ans = 0;
		int mul = 1;
		while(sn>0) {
			int rem = sn%db;  		//jisme hume jana hain uska base ka rem 
			ans = ans+rem*mul;
			mul = mul*sb;           //jisme hum hain uska base to increse power i.e 10^0  -  10^1    -   10^2    - 10^3.....
			sn = sn/db;    			//jisme hume jana hain uska base se n ko divide
		}
		System.out.println(ans);
	}

}
