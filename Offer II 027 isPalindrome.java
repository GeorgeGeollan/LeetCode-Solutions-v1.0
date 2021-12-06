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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode fast = head, slow = head;
        ListNode dummy = null;
        ListNode pre = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow.next;
            slow.next = dummy;
            dummy = slow;
            slow = pre;
        }

        if(fast != null)
            slow = slow.next;

        while(dummy != null && slow != null) {
            if(dummy.val != slow.val)
                return false;

            dummy = dummy.next;
            slow = slow.next;
        }

        return true;
    }
}
