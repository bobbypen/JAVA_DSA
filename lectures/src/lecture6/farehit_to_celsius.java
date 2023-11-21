package lecture6;
import java.util.Scanner;
public class farehit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int step = sc.nextInt();
		int i = minf;
		while(i<=maxf) {
			int c = (int) ((5.0/9) * (i-32));
			System.out.println(i + "\t" + c);
			i = i + step;
		}
		
	}

}
