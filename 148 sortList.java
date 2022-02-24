/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode fast = head.next, slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode tmp = slow.next;
        slow.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        
        while(left != null && right != null) {
            if(left.val < right.val) {
                dummy.next = left;
                left = left.next;
            }
            
            else {
                dummy.next = right;
                right = right.next;
            }
            
            dummy = dummy.next;
        }
        
        dummy.next = left == null ? right : left;
        
        return res.next;
    }
}
