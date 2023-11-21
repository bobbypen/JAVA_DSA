package lecture42;

import lecture34.Linkedlist.Node;

public class Linkedlist<T> {

	public class Node {
		T data;
		Node next; // kuki ye agle node ka address store krega
	}

	private Node head;
	private Node tail;
	private int size;

	public void Addfirst(T item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {

			nn.next = head;
			head = nn;
			size++;

		}
	}

	public void Display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}

		System.out.println(".");
	}

	public void Addlast(T item) {
		if (size == 0) {
			Addfirst(item);
		}else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
		
	}
	
		public void Addatindex(int k,T item) throws Exception {
			if (k==0) {
				Addfirst(item);
				
			}else if (k == size) {
				Addlast(item);
			}else {
				Node nn = new Node();
				nn.data = item;
				Node k_1th = getNode(k-1);
				nn.next = k_1th.next;
				k_1th.next = nn;
				size++;
			}
		}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Blklol size glt de raha hain");

		}

		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	
	public T getfirst() {
		return head.data;
	}
	
	public T getlast() {
		return tail.data;
		
	}
	public T getatindex(int k) throws Exception {
		return getNode(k).data;
	}
	
	public T removefirst() {
		
		Node temp = head;
		if (size == 1) {
			tail = null;
			head  = null;
			size--;
			
		}
		else {
			head = head.next;
			size--;
			temp.next = null;
		}
		return temp.data;
		
		
	}
	
	
	public int removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		}else {
			Node  nn = getNode(size-2);
			int rv = tail.data;
			nn.next = null;
			tail = nn;
			size--;
			return rv;
		}
	}
	
	
	public int removeatindex(int k) throws Exception{
		
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node k_1th = getNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.data;
		}

	}
	
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.Addlast("Ankur");
	}
	
}
