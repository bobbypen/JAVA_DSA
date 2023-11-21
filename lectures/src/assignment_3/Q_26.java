package assignment_3;
import java.util.*;
public class Q_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		int[] arr = new int[3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[j] = sc.nextInt();
			}
			int flag = ques(arr);
			
			if (flag >= 1) {
				
			sum = sum + 1;
			}
			
		}	
			System.out.println(sum);
		
	}
	
	
	public static int ques(int [] arr) {
		int count = 0;
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			if(arr[i] == 1) {
				count++;
			}
			}
			if (count>1) {
				flag = 1;
			}
				
			return flag;
		
		
		}
	}
	
