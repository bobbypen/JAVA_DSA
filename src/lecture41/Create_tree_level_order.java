package lecture41;
import java.util.*;
public class Create_tree_level_order {

	class Node{
		int val;
		Node left;
		Node right;
		
		
		
	}
	
	
	private Node root;
	
	public Create_tree_level_order() {
		CreateTree();
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	private void CreateTree() {
		
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1!=-1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);
			}
			
			
			if (c2!= -1) {
				Node node = new Node();
				rv.right = node;
				q.add(node);
			}
			
			
		}
		
		
	}
	
	public void INOrder() {
		
		INOrder(this.root);
		System.out.println();
	}
	
	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		
		INOrder(node.left);
		System.out.println(node.val+" ");
		INOrder(node.right);
		
	}
	
	public static void main(String[] args) {
		Create_tree_level_order lv  = new Create_tree_level_order();
		lv.INOrder();
	}
	
	
	
	
}
