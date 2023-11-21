package lecture29;

public class student {

	String name = "Kaju";
private	String names = "Kaju";
private	int age = 18;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) throws Exceptio {
	if (age<18) {
	throw new Exceptio(" 18 se upar ");
	}
	this.age = age;
}

//
//public void setAge(int age)  {
//	try {
//	if (age<0) {
//	throw new Exception(" negative se upar ");
//	}
//	
//	this.age = age;
//	}catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
////	
//	finally {
//		System.out.println("closed");
//	}
//}









//public void setname(String name) {
//	this.name = name;
//
//
//}
//
//
//
//public String getname() {
//	return this.name;
//}

}
