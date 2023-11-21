package assignment_3;
import java.util.Scanner;
public class Q_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
		int [] arr = {1,0,0,1,1,0,1};
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public static void sort(int [] arr) {
		int n = arr.length;
		 int a = 0;
		 int b = n - 1;  
		    while(a < b)  
		    {  
		        if(arr[a] == 1 && arr[b] == 0)  
		        {  
		            int temp = arr[a];  
		            arr[a] = arr[b];  
		            arr[b] = temp;  
		        }  
		        else if(arr[a] == 1)  
		        {  
		            b--;  
		        }  
		        else  
		        {  
		            a++;  
		        }  
		    }  
	}
}