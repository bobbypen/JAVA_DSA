package lecture29;

public class Person {
	
	String name;
	int age ;

	
	/*
	ye hota default construtor jo java khud se bnata h agr hum na banye toh
//	public Person() {
//		
//	}
	*/
	
	
	/*
	 
	 ye ho gya non parameterised consturtor isme value pass krdi agr hum value nhi denge toh ye deafult value lega 
	 
	 
	public Person() {
		this.name = "kaju"; //this. is choice lekin use krna chaiye 
		this.age = 25;
		
	}
	*/
	
	
	

//	parameterised construtor
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	public void fun() {
		int adhar = 245625;
 System.out.println( this.name + " " + this.age + " "  + adhar); // adahr ke sath this isliye nhi lagyenge kuki vo fuction ka data memeber hain 
		
	}
	
	
	
}
