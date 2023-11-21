package a_pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x  = 5;
		int arr [] = new int[x+1];
		printNos(arr,x);
		
	}

	public static int[] printNos(int [] arr, int x) {
		if (x==0) {
			return arr;
		}
		
		printNos(arr, x-1);
		arr[x]= x;
		System.out.print(arr[x] + " ");
		return arr;
		
		
	}
}
