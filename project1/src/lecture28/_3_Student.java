package lecture28;

public class _3_Student {

	String name;
	int age;
	
	public void intro() {
		System.out.println("my name  " + name + " age is " + age);
	}
	public void say(String name) {
		System.out.println(this.name + " say hello " + name);
	}
	
	
	
	public static void fun(int x) {
		System.out.println("this is fun " + x);
	}
}
