package geeksforgeeks;

import java.util.Arrays;

public class _2_findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 int N = 7;
int	arr[] = {2, 3, 4, 1, 6 ,7};
Arrays.sort(arr);
	int a = miss(arr,N);
	System.out.println(a);
	}
	
	public static int miss(int []arr,int N) {
		
	
int find = 1;
if (find<=N) {
	

for (int i = 0; i <= N; i++) {
	
	
	
	
	if (find != arr[i]) {
		break;
	} else  {
		find++;
	}
	
}


	
}
return find;






	}

}
