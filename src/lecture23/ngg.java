package lecture23;
import java.util.*;
public class ngg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
//		String a = "";
		
		System.out.println(print(a));
}

	public static int print(String type ) {
		
		
		int i = 4;
		int l = 8;
		int f = 4;
		int d = 8;
		int c = 1;
		
		
		
		  if(type .equals( "Integer")){
		        return i;
		  }else if (type .equals( "Long")) {
			return l;
			
		}else if (type .equals( "Float")) {
			return f;
		}else if (type .equals( "Double")) {
			return d;
		}else {
		return c;
		}
	}
	
}