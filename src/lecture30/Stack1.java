package lecture30;

public class Stack1 {

	private int [] data ; //taki koi bhar se koi bhi number access na kr paye 
	
	// top batyega kha se data rakhna hain 
	int top = 0;
	
	
	//making default constuactor  agr user kuch nhi bolega toh stack 5 sixe ka banega
	public Stack1() {
		this.data = new int[5];
	}
	
	
	//parameterized constructor agr user apni icha ka stack banana chata ho toh 
	
	public Stack1(int cap) {
		this.data = new int[cap];
	}
	
	
//	/empty tb hi hoga tb top ==0 hoga
	public boolean isEmpty() {
		return top ==0;// agr top 0 pr hoga mtlb isme ek bhi element nhi hain na 
	}
	
	
//	to add element in stack
	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception ("YE Toh ful hain");	
		}
		
		
		this.data[top] = item; // jo top value h us idex pr vaue daal do
		this.top++;     // or ab top ko increment kr denge  taki next pr chal jaye
	}
	
	
	public boolean isFull() {
		return top == this.data.length;
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception ("ye toh full hain");
		}
		this.top--; //ek element piche kr liya top se
		return this.data[top];  // vo elemt return kr dia agr dekhna ho konsa remove hua hain toh
	}
	
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception ("ye toh full hain");
		}
		return this.data[top-1]; //ye top pr last elemt btayega or ek extra chalta h index isliye ek piche
	}
	
	public int size() {
		return this.top;
	}
	
	
	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.data[i] + " ");
			
		}
		System.out.println();
	}
}
