package lecture28;

public class _4_student_de {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_3_Student s = new _3_Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.intro();
		s.name = "kaju";
		s.age = 14;
		s.intro();
		
		
		
		_3_Student s1 = new _3_Student();
		s1.name = "aaju";
		s1.age = 19;
		s1.intro();
		
		
		_3_Student s2 = new _3_Student();
		s2.name = "raju";
		s2.age = 18;
		s2.intro();
		
		
		
		s.say("bobby");
		
		_3_Student.fun(5); // only if the variable is static 
		
		
	}

}
