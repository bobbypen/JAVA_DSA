package lecture38;

import lecture38._1_leetcode101.TreeNode;

public class _2_leetcode951 {

	
	
	
	
	
	
	
	
	
	
	
	
	 class Solution{
		 public boolean flipEqiv(TreeNode root) {
			 return Symmetric(root.left,root.right);
		 }
		 
		 public boolean Symmetric(TreeNode root1,TreeNode root2) {
			 if (root1 == null && root2 == null) {
				return true;
			}
			 if (root1 == null || root2 == null) {
				return false;
			}
			 
			 boolean flip = flipEqiv(root1.left,root2.right) && flipEqiv(root1.right,root2.left);
			 boolean noflip = flipEqiv(root1.right,root2.left) && flipEqiv(root1.right,root2.left);
			 return flip || noflip;
			 
		 }
		 
	 }

}

