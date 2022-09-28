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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy, end = dummy;

        while(n != 0) {
            pre = pre.next;
            n--;
        }

        while(pre.next != null) {
            pre = pre.next;
            end = end.next;
        }

        end.next = end.next.next;

        return dummy.next;
    }
}
