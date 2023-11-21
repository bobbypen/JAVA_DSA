package lecture41;

public class leetcode_105 {

	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		class Solution {
		    public TreeNode buildTree(int[] preorder, int[] inorder) {
		      
		    	
		    	return CreateTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
		    	
		    		    	
		    }
		    
		    public TreeNode CreateTree(int [] pre,int [] in,int ilo , int ihi,int plo,int phi) {
				
		    	if (plo>phi || ilo>ihi) {
					return null;
				}
		    	
		    	
		    	TreeNode node = new TreeNode(pre[plo]);
		    	int idx = Search(in,ilo,ihi,pre[plo]);
		    	
		    	int c = idx - ilo;
		    	node.left = CreateTree(pre,in,ilo,idx-1,plo+1,plo+c);
		    	node.right = CreateTree(pre,in,idx+1,ihi,plo+c+1,phi);
		    	return node;
		    	
		    	
		    	
			}
		    
		    
		    public static int Search(int [] in, int ilo, int ihi,int item) {
		    	for (int i = ilo; i<= ihi; i++) {
					if (in[i] == item) {
						return i;
					}
				}
		    	return 0;
		    }
		    
		}

}
