package easy;

public class Count_pairs_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 2;
		int count = 0;
	int	arr[] = {1, 1,1,1};

	int i =0;
	int j = arr.length-1;
	
	while (i<arr.length) {
		
		
		if (arr[i] + arr[j]>k) {
			j--;
		}else if (arr[i] + arr[j]<k) {
			i++;
		}else {
			count++;
			if (j<=i) {
				i++;
				j =arr.length-1;
				continue;
			}
			
		}
		
	}
	
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Again TL
	
	
	
	
	
//	int i =0;
//	int j = arr.length-1;
//	
//		
//	while (i<arr.length) {
//		
//		if (j==i) {
//			i++;
//			j =arr.length-1;
//			continue;
//		}
//		
//		
//		if (arr[i] + arr[j]==k) {
////			
//			count++;
////			
//		}
//		 j--;
//		
//	}
//	System.out.println(count);
//	
	
	
	
	
	
	
	
	
//	TL with this approch
//	
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//			
//			
//			if (arr[i] + arr[j]==k) {
//				
//				count++;
//				
//			}
//		}
//	}
//	
//	System.out.println(count);
		
	}

}
