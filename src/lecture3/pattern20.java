package lecture3;
import java.util.Scanner;
public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();
int row = 1;
int star = 1;
int space = n/2+1;
int space1 = -1;

while(row<=n) {
	int i = 1;
	while(i<=space) {
		System.out.print("  ");
		i++;
	}
	
	int k = 1;
	while(k<=star) {
		System.out.print("* ");
		k++;
	}
	//space `````````````````````````````````````````
	int m = 1;
	if(row==1||row==n) {
		m++;
	}
	while(m<=space1)
	{
		System.out.print("  ");
		m++;
	}
	//star````````````````````````````````
	if(row !=1 && row!=n ) {
	int l = 1;
	while(l<=star) {
		System.out.print("* ");
		l++;
	}
	}
	if (row < n/2+1) {
		space--;
		space1+=2;
	}else {
		space++;
		space1-=2;
	}
	
	row++;
	System.out.println();
	
	
}
	}

}
