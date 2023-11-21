package lecture8;
import java.util.Scanner;
public class _2_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
//			System.out.println();
		}
		
		
		// loop to print value
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
//			System.out.println();
		}
		
		System.out.println();
		
		display(arr);//function to print vaalue
		System.out.println();
	}
		
		
		
		/*
		// same statement by function
for (int j = 0; j < arr.length; j++) {
	System.out.print(arr[j] + " " );
	
}
		*/
		
		public static void display(int [] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}


}
