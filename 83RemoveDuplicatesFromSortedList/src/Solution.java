
public class Solution {
	public static void main(String[] args) {
		//construct the node list
//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(1);
//		ListNode node3 = new ListNode(2);
//		node1.next = node2;
//		node2.next = node3;
//		deleteDuplicates(node1);

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		deleteDuplicates(node1);
		System.out.println("Hello World");
	}
    public static ListNode deleteDuplicates(ListNode head) {
    	ListNode node = head;
    	while(node != null && node.next != null) {
    		if(node.val == node.next.val) {
    			// delete the duplicated element
    			node.next = node.next.next;
    		} else {
    			node = node.next;
    		}
    	}
        return head;
    }
}
