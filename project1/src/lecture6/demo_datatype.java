package lecture6;

public class demo_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 't';
		char a = '9';
		char b = 1200;
		System.out.println(a);
		//to check its intergratal value 
		System.out.println((int) (a));
		System.out.println((char) (b));
		
		//	a = a+1;  it gives error because we adding interger in char
		//but we can 
		
		a = (char) (ch+1);
		System.out.println(ch);
		
	//	long l = 1245789456123541; this giving error
		long l = 872787812829l; // if e add l at end then error remove
		
//		float f = 45.4; will give error 
		float f = 22.3f;  //by adding f at en remove end 	
	}

}
