package lecture33;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		p obj = new p();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
//		
//		
		
//		p obj = new c();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((c)(obj)).d2);
//		System.out.println(((c)(obj)).d);
//		obj.fun();
//		obj.fun1();
//		
//		((c) (obj)).fun2();
//		
		
		
//		c obj = new p();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		
		
		
		c obj = new c();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((p)(obj)).d);
		
		obj.fun();
		obj.fun1();
		obj.fun2();
		
		
		
		
	}
	

}
