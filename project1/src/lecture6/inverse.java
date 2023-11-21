package lecture6;
import java.util.Scanner;
public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 32145;
		int pos = 1;
		int sum = 0;
		while(n>0){
			int rem = n % 10;
			sum = (int) (sum + pos * Math.pow(10, rem - 1));
			n= n/10;
			pos++;
		}
		System.out.println(sum);
	}

}
