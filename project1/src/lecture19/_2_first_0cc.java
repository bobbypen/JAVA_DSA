package lecture19;

public class _2_first_0cc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,7,8,5,2,5,11};
		int item = 5;
		System.out.println(rec(arr,item,0));
	}
	
	public static int rec(int [] arr,int item,int index) {
		if (index == arr.length) {
			return -1;
		}
		
		
		if (arr[index] == item ) {
			return index;
		}
		return rec(arr,item,index+1);
	}

	
}
