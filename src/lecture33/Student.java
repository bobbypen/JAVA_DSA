package lecture33;

public class Student {

	String name = "bobby";
	int age = 12;
	
	
	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		System.out.println(s);
		
	}

}
