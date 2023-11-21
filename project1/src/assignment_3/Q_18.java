package assignment_3;
import java.util.Scanner;

public class Q_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
	         Scanner scn=new Scanner(System.in);
       int n = scn.nextInt(); 
         int[] arr=new int[n];
          for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
         }
	                     sortColors(arr); 
	           for (int i = 0; i < arr.length; i++){
	              System.out.println(arr[i]);
	           }
	    }
	
	
	    public static void sortColors(int[] nums) {
	        // Write your code here
	    	
	    	for (int i = 0; i < nums.length; i++) {
				int min = i;
				for (int j = i+1; j < nums.length; j++) {
					if (nums[j]<nums[min]) {
						min = j;
					}
				}
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
			}
	    	
	    	
	    }
}
