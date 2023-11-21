package assignment_3;
import java.util.*;
public class Q_19_c {

	//this is best solution
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int count = 1;
		int countofmajor = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] == arr[i]) {
				
			
			count++;
			
		}
		else {
			if (count>n/3) {
			System.out.print(arr[i-1]+" ");	
			}
			count=1;
		}
		}
	
		if (count>(n/3)) {
			System.out.print(arr[n-1]);
		}
		
		if (countofmajor==0) {
			System.out.println("No Majority Elements");
		}

	}
}