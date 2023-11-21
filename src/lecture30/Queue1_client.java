package lecture30;

public class Queue1_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue1 q = new Queue1();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		q.Dequeue();
		q.Dequeue();
		q.Display();
		
		q.Enqueue(70);
		q.Enqueue(80);
		q.Display();
		System.out.println(q.getfront());
	}

}
