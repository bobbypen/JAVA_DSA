package lecture40;



public class BinarySearchTree {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySearchTree(int[] in) {

		root = CreateTree(in, 0, in.length - 1);

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
	
	public void Display() {
		Display(root);
	}
	
	
	
	

	public Node CreateTree(int[] in, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);
		return nn;
	}

}
