package assignment_3;
import java.util.*;
public class Q_24 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long [] arr = new long[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextLong();
	}

	
	long [] ans = product(arr,n);
	for (int j = 0; j < arr.length; j++) {
		System.out.print(ans[j]+" ");
	}
	
	}

public static long[] product(long [] arr,int n) {


long [] left = new long [n];
long [] right = new long [n];

left[0] = 1;
for (int i = 1; i <	n; i++) {
	left[i] = arr[i-1] * left[i-1];
}

right[n-1] = 1;
for (int i = n-2; i >=0; i--) {
	right[i] = arr[i+1] * right[i+1];
	
}

for (int i = 0; i < n; i++) {
	left[i] = left[i] * right[i];
}

return left;
}
}