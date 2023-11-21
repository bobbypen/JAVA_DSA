package assignment2;

public class Q_5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 101010;
int mul = 1;
int ans = 0;
while (n>0) {
	int rem = n%10;
	ans = ans + rem*mul;
	mul = mul*2;
	n= n/10;
}
System.out.println(ans);
	}

}
