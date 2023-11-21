package assignment_3;

public class Q_19 {
 
	//this is side for n/2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,2,3,1,3,2,1,1};
		int n = arr.length;
		
		major(arr,n);
		
	}
	
	
	public static void major(int [] arr,int n) {
		
		int max = 0;
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					
			}
		}
				if (count>max ) {
					max = count;
					index = i;
					
						
					}
					
					
				}
				
		if (max > n / 2) {
            System.out.println(arr[index]);
  
		}
	else {
		System.out.println("No Majority Elements");
	}	
		
	}
		
	}

	


