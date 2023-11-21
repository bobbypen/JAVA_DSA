package _1_Love_Babbar_DSA;
import java.util.*;
public class Reverse_anArray_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
		String str = "Geeks";
		String st1 = "";
		char a ;
		
		for (int i = 0; i <str.length(); i++) {
			a = str.charAt(i); //extract character oone by one
			st1 = a+st1;
		}
		
		System.out.println(st1);
		
	}

}
