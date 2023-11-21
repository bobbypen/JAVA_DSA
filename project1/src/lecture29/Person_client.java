package lecture29;

public class Person_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using person class creating bject of it 
		
		Person p = new Person("bob",45);
		
		p.fun();
		
		
		p.name = "bobby"; // ye value bina hi ye parameter me di hui value print krega as above
		p.age = 12;
		
		p.fun();
		
//		Person p2 = new Person();
		
		p.name = "kunal";
		p.age = 14;
		p.fun();
		
		
		
	}

}
