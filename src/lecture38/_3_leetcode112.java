package lecture38;

import lecture38._1_leetcode101.TreeNode;

public class _3_leetcode112 {

	
	class Solution {
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	        
	    	
	    	if (root == null) {
				return false;
			}
	    	
	    	if (root.left == null && root.right == null) {
				return targetSum - root.val == 0;
			}
	    	
	    	boolean left = hasPathSum(root.left,targetSum - root.val);
	    	boolean right = hasPathSum(root.right,targetSum - root.val);
	    	return left || right;
	    	
	    	
	    	
	    }
	}
	
	
}
