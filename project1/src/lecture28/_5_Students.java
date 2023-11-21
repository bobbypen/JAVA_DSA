package lecture28;

public class _5_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		_6_Students_c s = new _6_Students_c(); // same as class ne Students_c
//		
//		System.out.println(s.name);
//		System.out.println(s.age);
//		s.name = "Bobby";
//		s.age = 21;
//		System.out.println(s.age);
//		System.out.println(s.name);
//		
//		_6_Students_c s1 = new _6_Students_c();
//		
//		
//		s1.name = "Bob";
//		s1.age = 12;
//		System.out.println(s1.age);
//		System.out.println(s1.name);
//		
//		
//		//caling function  by different object
//		
//		
//		
//		s.intro();
//		s1.intro();
//		
		
		
		_6_Students_c s2 = new _6_Students_c();
		_6_Students_c s3 = new _6_Students_c();
		
		
		s2.name = "kunal";
		s2.age = 28;
		s3.name = "Hardik";
		s3.age = 26;
		System.out.println(s2.name +" " +s2.age );
		System.out.println(s3.name +" " +s3.age );
		
		
		System.out.println("***********************");
		
		
		//test1(s2,s3); // no change will apperar with this test1
//		test2(s2,s3); // change will apperar with this test2
		
		int myage = 20;
		String myname = "C";
		test3(s2,s3.age,s3.name,myage,myname);
		
		
		System.out.println(s2.name +" " +s2.age );
		System.out.println(s3.name +" " +s3.age );		
		
		
	}
	
	
	public static void test1(_6_Students_c s2 , _6_Students_c s3 ) { // no change is apearing stack udega sb chala jayega 
		_6_Students_c t = s2;
		s2 = s3;
		s3 = t;
	}

	public static void test2(_6_Students_c s2 , _6_Students_c s3 ) {
		
		s2 = new _6_Students_c ();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;
		
		s3 = new _6_Students_c ();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}
	
	
	public static void test3(_6_Students_c s, int age , String name , int myage ,String myname ) {
		
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myage = 0;
		myname = "_";
		
		
		
		
		
	}
	
	
}
