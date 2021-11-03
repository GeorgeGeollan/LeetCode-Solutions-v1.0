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
        ListNode ptr = dummy;
        while(n >= 0 && ptr != null) {
            ptr = ptr.next;
            n--;
        }
        ListNode cur = dummy;

        while(ptr != null) {
            ptr = ptr.next;
            cur = cur.next;
        }

        cur.next = cur.next.next;

        return dummy.next;
    }
}
