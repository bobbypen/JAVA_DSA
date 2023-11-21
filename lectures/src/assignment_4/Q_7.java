package assignment_4;
import java.util.*;
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int strength = sc.nextInt();
		char [][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.next().charAt(arr[i][j]);
			}
		}
		
		magic(arr,k,strength);
	
	}
	
	public static void magic(char [] []arr,int k,int strength) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == '.') {
					strength = strength-2-1;
				} else if (arr[i][j] == '*') {
					strength = strength + 5-1;

				}
				else{
					break;
				}
			}
		}
		
		if (strength>=k) {
			System.out.println("Yes");
			System.out.println(strength);
		}else {
			System.out.println("No");
//			System.out.println(strength);
		}
	}

}
