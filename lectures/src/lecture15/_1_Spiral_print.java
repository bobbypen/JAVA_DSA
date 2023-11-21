package lecture15;

public class _1_Spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = {{1,2,3,4,5 },
						{5,6,7,8,9},
						{9,10,11,12,11},
						{13,14,15,16,12}};
		print(arr);
	}
public static void print(int [] [] arr ) {
	int minc = 0;
	int minr = 0;
	int maxr = arr.length-1;
	int maxc = arr[0].length-1;
	int total = arr.length*arr[0].length;
	int count = 0;
	
	while(count<total) {
		
		for (int i = minr; i <= maxc && count<total; i++) {
			System.out.print(arr[minr] [i] + " ");
			count++;
	}
		minr++;
		
		for (int i = minr; i <= maxr && count<total; i++) {
			System.out.print(arr[i][maxc] + " " );
			count++;
		}
		maxc--;
		
		for (int i = maxc; i >= minc && count<total; i--) {
			System.out.print(arr[maxr] [i] + " ");
		count++;
		}
		maxr--;
		
		for (int i = maxr; i >=minr && count<total; i--) {
			System.out.print(arr[i] [minc] + " ");
			count++;
		}
		minc++;
	}
	
}
}
