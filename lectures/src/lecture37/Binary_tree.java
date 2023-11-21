package lecture37;

import java.util.*;

public class Binary_tree {

	private class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_tree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {

		if (nn == null) {
			return;
		}

		String s = "";
		s = "<--" + s + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}

		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}

		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		if (nn == null) {
			
			return Integer.MIN_VALUE;
		}
		
		int left = max(nn.left);
		int right = max(nn.right);
		
		return Math.max(nn.val,Math.max(left, right));
		
	}
	

	public boolean find(int item) {
		return find(this.root,item);
	}
	
	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		
		if (nn.val == item) {
			return true;
		}
		
		boolean left = find(nn.left,item);
		boolean right = find(nn.right,item);
		return left || right;
		
	}
	
	public int ht() {
		return ht(this.root);
	}
	
	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
		
	}
	
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	
	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val+ " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);//add last
		while(!q.isEmpty()) {
			Node nn = q.remove();//remove first
			System.out.print(nn.val + " ");
			if (nn.left != null) {
				q.add(nn.left);
			}
			if (nn.right != null) {
				q.add(nn.right);
			}
		}
		System.out.println();
	}
	
}
