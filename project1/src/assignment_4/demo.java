package assignment_4;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
	    int  [][]arr = new int[m][n];
	    for(int i=0;i<arr.length;i++) {
	    for(int j=0;j<arr[0].length;j++) {
	    arr[i][j]=sc.nextInt();
	    
	    	}
	    }
//		int [][] arr = {{11, 12, 13, 14,15},
//		{21, 22, 23, 24,25},
//		{31, 32, 33, 34,35},
//		{41, 42, 43, 44,45}};
//		
		
	    		Spiral(arr);
	    		 
	}
	public static void Spiral(int [][]arr) {
		
	int minr=0;
	int maxr=arr.length-1;
	int minc=0;
	int maxc=arr[0].length-1;
	int count=0;
	int e=arr.length*arr[0].length;
	while(count<e) {
		for(int i=minr;i<=maxr && count<e;i++) {
			System.out.print(arr[i][minc]+", ");
			count++;
		}
		minc++;
		for(int i=minc;i<=maxc && count<e;i++) {
			System.out.print(arr[maxr][i]+", ");
			count++;
	}
		maxr--;
		for(int i=maxr;i>=minr && count<e;i--) {
			System.out.print(arr[i][maxc]+", ");
			count++;

}
		maxc--;
		for(int i=maxc;i>=minc && count<e;i--) {
			System.out.print(arr[minr][i]+", ");
			count++;

}
		minr++;
	}
	

		System.out.print("END");
	

	}

}
