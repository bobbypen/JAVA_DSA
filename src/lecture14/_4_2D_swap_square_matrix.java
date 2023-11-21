package lecture14;

public class _4_2D_swap_square_matrix {
//for square matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3,4},
				        {5,6,7,8},
			         	{10,11,12,13},
			         	{14,15,16,17}};
		
		swap(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
public static void swap(int [] [] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr[0].length; j++) {
			int temp = arr[i] [j] ;
			arr[i][j] = arr[j] [i];
			arr[j] [i] = temp;
		}
	}
}
}
