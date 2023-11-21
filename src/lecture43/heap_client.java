package lecture43;
import java.util.*;
public class heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Heap hp = new Heap();
		hp.Add(4);
		hp.Add(5);
		hp.Add(7);
		hp.Add(1);
		hp.Add(6);
		hp.Add(9);
		hp.Add(3);
//	System.out.println(hp.get());
//	hp.Display();
//	System.out.println(hp.remove());
	hp.Display();
	
	
//	PriorityQueue<Integer>pq = new PriorityQueue<Integer>();   // this for min heap
	PriorityQueue<Integer>pq = new PriorityQueue<Integer>(Collections.reverseOrder());   // this for min heap
	
	pq.add(4);
	pq.add(5);
	pq.add(7);
	pq.add(1);
	pq.add(6);
	pq.add(9);
	pq.add(3);
	
	System.out.println(pq);
	System.out.println(pq.poll()); //pq.remove
	System.out.println(pq.peek());	//get
	
	
	
	}

}
