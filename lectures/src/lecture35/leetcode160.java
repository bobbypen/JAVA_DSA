package lecture35;

public class leetcode160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public class Solution {
			public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
				
				ListNode kartik = headA;
				ListNode kartikgf = headB;
				while(kartik != kartikgf) {
					if (kartik == null) {
						kartik = headB;
					}else {
						kartik = kartik.next;
						
					}
					
					if(kartikgf == null) {
						kartikgf = headA;
					}else {
						kartikgf = kartikgf.next;
					}
				}
				return kartikgf;
				
			}
		}
		
		
	}
	

}
