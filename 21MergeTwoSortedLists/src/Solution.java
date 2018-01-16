/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public static void main(String[] args) {
		// list1
		System.out.println("Hello World");
	}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	// initialize result
    	ListNode result;
    	ListNode head;
    	if(l1.val <= l2.val) {
    		result = new ListNode(l1.val);
    		l1 = l1.next;
    	} else {
    		result = new ListNode(l2.val);
    		l2 = l2.next;
    	}

    	head = result;
    	while(l1 != null && l2 != null) {
    		if(l1.val <= l2.val) {
    			result.next = new ListNode(l1.val);
    			l1 = l1.next;
    		} else {
    			result.next = new ListNode(l2.val);
    			l2 = l2.next;
    		}
    		result = result.next;
    	}
    	if (l1 == null) {
    		result.next = l2;
    	} else {
    		result.next = l1;
    	}
        return head;
    }
}
