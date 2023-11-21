package lecture14;
import java.util.*;
public class _6_Search_element_another_way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//OPTIMUM AND FASTEST WAY TO SEARCH
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] [] arr = new int [n] [m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		
		System.out.println(search(arr,target));
		
	}
	
	public static int search(int [] [] arr,int target ) {
		int row = 0;
		int col = arr[0].length-1;
		while (col>=0 && row<arr.length) {
			if (arr[row][col]==target) {
				return 1;
			} else if(arr[row][col]>target){
				col--;
			}else {
				row++;
			}
		}
		return 0; 
	}

}
