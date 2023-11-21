package lecture8;

import java.util.Iterator;

public class _1 {

	public static void main(String[] args) {
		
//		int [] arr  = null;
		int [] arr = new int [5] ;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
System.out.println();
		
		
		arr[0] = 1;
		arr[1] = 12;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 11;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		
		
		System.out.println();
		
		System.out.println(arr.length);//size

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 * (i+1);
			System.out.print(arr[i] + " ");
		}
}
}