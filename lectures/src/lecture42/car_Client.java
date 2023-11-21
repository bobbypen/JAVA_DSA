package lecture42;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.*;

public class car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car[] arr = new car[5];
		arr[0] = new car(200,10,"white");
		arr[1] = new car(2000,20,"yellow");
		arr[2] = new car(4000,6,"pink");
		arr[3] = new car(2100,89,"grey");
		arr[4] = new car(2900,6,"blue");
		
		Arrays.sort(arr, new Comparator<car>() {
			
			
			@Override
			public int compare(car o1, car o2 ) {
				
			return o1.price - o2.price;
		}
		});
	
		
		//		sort(arr);
		Display(arr);
		
		
	}
	
	public static <T> void Display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	
//	public static <T extends Comparable<T>> void sort(T[] arr) {
//	
//	for (int turn = 1; turn < arr.length; turn++) {
//		for (int i = 0; i < arr.length - turn; i++) {
//			if (arr[i].compareTo(arr[i+1]) > 0) {
//				T t = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = t;
//			}
//		}
//		
//	}	
//}

}
