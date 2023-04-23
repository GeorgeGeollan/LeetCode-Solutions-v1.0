/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;
        ListNode pre = null;

        while(ptr != null) {
            if(pre != null && ptr.val == val) {
                pre.next = pre.next.next;
                break;
            }

            
            if(ptr == null) {
                break;
            } 

            pre = ptr;
            ptr = ptr.next;
        }

        return dummy.next;
    }
}
