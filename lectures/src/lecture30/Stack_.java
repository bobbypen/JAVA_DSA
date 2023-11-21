package lecture30;

public class Stack_ {
	
	protected int[] arr;
	private int idx = -1;
	
	public Stack_() {
		arr = new int[5];
	}
	public Stack_(int n) {
		arr = new int[n];
	}
	public boolean isEmpty() {
		return idx == -1;
	}
	
	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol stack full");
		}
		idx++;
		arr[idx] = item;
	}
	public int size() {
		return idx+1;
	}
	
	public boolean isfull() {
		return idx == arr.length-1;
	}
	
	
	
	public int pop() throws Exception{
		
		if (isEmpty()) {
			throw new Exception("Bklol kahli h");
		}
		int rv = arr[idx];
		 idx--;
		 return rv;
		 
	}
	
	
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol kahli h");
		}
		return arr[idx];
	}
	
	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	
	
}
