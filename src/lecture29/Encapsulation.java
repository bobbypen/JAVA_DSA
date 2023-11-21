package lecture29;

public class Encapsulation {

	
	//data member private kr diye
	
	private String name;
	private int age;
	
	
	// ab get and set ke through acces kr re hain 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// create fun also to get it
	
	public void fun() {
		System.out.println(this.name + " " + this.age);
	}
	
	
}
