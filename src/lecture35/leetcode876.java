package lecture35;

public class leetcode876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class solution {
			
//			paste from here in leetcode
			public ListNode middleNode(ListNode head) {
				
				ListNode slow = head;
				ListNode fast = head;
				while(fast != null && fast.next !=null) {
					slow = slow.next;
					fast = fast.next.next
				}
				return slow;
				
				
			}
		}
		
		
		
		
	}

}
