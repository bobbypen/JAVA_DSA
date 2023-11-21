package lecture30;

public class Queue_ {
	
	private int[] arr;
	private int front = 0;
	private int size = 0;
	
	public Queue_() {
		arr = new int[5];
		
	}
	
	public Queue_(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			
			throw new Exception("Queue is full");
			
			
			
		}
		
		
		
		int idx = (front+size) % arr.length;
		arr[size] = item;
		size++;
	}
	
	public int Dequeue() throws Exception {
		
		if (isEmpty()) {
			
			throw new Exception("Queue is Empty");
			
			
			
		}
		
		
		int rv = arr[front];
		front = (front+1)%arr.length;
		front++;
		size--;
		return rv;
	}
	
	public boolean isfull() {
		return size == arr.length;
	}
	
	public int getfront() {
		int rv = arr[front];
		return rv;
	}
	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front+i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
	}
	
}
