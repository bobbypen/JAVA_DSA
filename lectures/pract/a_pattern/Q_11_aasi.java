package a_pattern;

public class Q_11_aasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 7;
int space = n-1;
int space1 = -1;
int count = 1;
int star = 1;
int row = 1;
while (row<=n) {
	int count1 = count;
	int c = 1;
	int i = 1;
	while (i<=space) {
		System.out.print(" ");
		i++;
	}
	int j = 1;
	while (j<=star) {
		System.out.print(count1);
		j++;
		count1--;
	}
	
	int k = 1;
	if (row!=1&&row!=n) {
		
	
	while (k<=space1) {
		System.out.print(" ");
		k++;
	}
	}
	
	int l = 1;
	if (row==1 || row==n) {
		l++;
	}

	while (l<=star) {
		System.out.print(c);
		l++;
		c++;
	}
//	
	if (row<= (n-1)/2) {
		space-=2;
		star++;
		space1+=2;
		count++;
	}else {
		space+=2;
		star--;
		space1-=2;
		count--;
	}



row++;

System.out.println();
	}

}}
