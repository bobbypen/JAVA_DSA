package assignment_3;
import java.util.*;
public class Q_6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();	 //no. of rose
		long [] arr = new long[n]; // price of rose 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}		
		int money  = sc.nextInt();
		
		
		
		Arrays.sort(arr);
		
		rose(arr,money);
		
		
		t--;
		}
	}

	public static void rose(long[] arr,int money) {
		int n = arr.length;
		int i = 0;
		int j = n-1;
		
		int mini = 0;
		int minj = 0;
		
		long diff = 1000000000;
		while (i<=j) {
		long sum = arr[i] + arr[j];
		if(sum == money) {
			if(diff >= arr[j] - arr[i]){
				 mini=i;
				  minj=j;	
				diff=arr[j]-arr[i];
				}
			
			i++;
			j--;
		}else if(arr[i] + arr[j]>money) {
			j--;
		}else if(arr[i] + arr[j] < money) {
			i++;
		}	
		}
		if(arr[i]>arr[j]) {
		System.out.println("Deepak should buy roses whose prices are" + " " + arr[j]	+ " " + "and" + " " + arr[i]+".");
		}else {
			System.out.println("Deepak should buy roses whose prices are" + " " + arr[i]	+ " " + "and" + " " + arr[j]+".");

		}
	}
}
