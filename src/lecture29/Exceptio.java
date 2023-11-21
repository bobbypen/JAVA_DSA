package lecture29;

public class Exceptio {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	//for throws exception
//	public void setAge(int age) throws Exception{
//		
//		if (age<0) {
//			throw new Exception(" Galti kiye ho tum");
//		}
//
//		
//		this.age = age;
//	}
	
	
	//try and catch
	public void setAge(int age) {
		try {
		if (age<0) {
			throw new Exception(" Galti kiye ho tum");
		}
	}
	catch (Exception e) {
		// TODO: handle exception
//		System.out.println(e);
		
		e.printStackTrace();
	}
		
		this.age = age;
	}
	
	
	
}
