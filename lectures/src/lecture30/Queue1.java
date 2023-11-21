package lecture30;

public class Queue1 {
	
	private int [] data ;  //ek array jisko koi acces na kr paye out of class
	private int front = 0;  //  its FIFO. to get the first value use front
	private int size = 0; // its store the size
	
	
	
	//this.    is choice
	
	public Queue1() {
		this.data = new int[5];
	}
	
	public Queue1(int cap) {
		this.data = new int[cap];
	}
	
		public boolean isEmpty() {
			return this.size==0;
		}

		public boolean isFull() {
			return this.size == this.data.length;
		}
		
		public int size() {
			return size;
		}
		
		public void Enqueue(int item) throws Exception {
			
			if (isFull()) {
				throw new Exception ("Full h deva");
			}
			
			int i = (this.size+this.front)%data.length;
			this.data[i] = item;
			this.size++;
		}
		
		
		public int Dequeue() throws Exception { //size bhi kaam krna hoga na or front aage krdete h 
			
			
			if (isEmpty()) {
				throw new Exception ("khali h deva");
			}
			int rv = this.data[this.front];
			this.front = (front+1)%data.length;;
			this.size--;
			return rv;
		}
		
		
		public int getfront() {
			return this.data[this.front];
		}

		public void Display() {
			for (int i = 0; i < this.size; i++) {
				int idx = (this.front+i)%this.data.length;
				System.out.print(this.data[idx] + " ");
			}
			System.out.println();
		}
		
		
}
