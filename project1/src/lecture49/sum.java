package lecture49;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,1,5,7};
		int k = 6;
		int count = 0;
		int ans = 0;
		
		int i = 0;
		int j = arr.length-1;
		while (i<j) {
		
		ans = i + j;
		if (ans>k) {
			
			j--;
			ans = 0;
		}else if (ans<k) {
			i++;
		}else {
			
			count++;
		}
			
		}
		
		System.out.println(count);

	}

}
