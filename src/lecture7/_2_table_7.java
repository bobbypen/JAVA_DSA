package lecture7;
import java.util.Scanner;
public class _2_table_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dont print those are multiple of 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		table(n);
	}
	
	public static void table(int n) {
	
	int i = 1;
	int e = 10;
	int t;
	while(i<=e) {
		
		t = i * n;
		if(t%4==0) {
			i++;
		}else {
		System.out.println(t);
		i++;
		}
	}
		
}
}
