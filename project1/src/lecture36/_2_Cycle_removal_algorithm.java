package lecture36;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

//import lecture34.Linkedlist.Node;

//import lecture34.Linkedlist.Node;

public class _2_Cycle_removal_algorithm {

	public class Node {
		int data;
		Node next; // kuki ye agle node ka address store krega
	}

	private Node head;
	private Node tail;
	private int size;

	public void Addfirst(int item) {
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

	public void Addlast(int item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
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

	public void CreateCycle() throws Exception {
		Node kth = getNode(2);
		tail.next = kth;
	}

	public Node hasCycle() {

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}

		return null;
	}

	public void CycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}

		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {

				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}

	}
	
	
	
	public void CycleRemoval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}

	//cycle ki length
			Node temp = meet;
			int count = 1;
			while (temp.next != meet) {

				count++;
				
				temp = temp.next;
			}
	

	
		Node fast = head;
		
		for(int i = 0; i<count; i++) {
			fast = fast.next;
		}
		
		
		Node slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	
}
	
	
	
	
	public void floyedcycleremoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		
		
		Node slow = head;
		Node fast = meet;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	
}
	
	

	public static void main(String[] args) throws Exception {
		_2_Cycle_removal_algorithm cy = new _2_Cycle_removal_algorithm();
		cy.Addlast(1);
		cy.Addlast(2);
		cy.Addlast(3);
		cy.Addlast(4);
		cy.Addlast(5);
		cy.Addlast(6);

		cy.CreateCycle();
//		cy.CycleRemoval();
		cy.CycleRemoval2();
		
		cy.Display();
	}
}
