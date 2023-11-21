package lecture18;

public class _6_Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100;
		int a1 = 10; 
		System.out.println(a);
		System.out.println(a1);
		//but discribed in copy
		//a store address in stack ans value in heap in some address due to its is class
		//store value in stack due to primitive
		
		
		a = a1;
		System.out.println(a);//autoboxing
		//now a is 10
		a1=a;
		System.out.println(a1);//unboxing
		
	}

}
