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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        
        ListNode nxt = head.next;
        ListNode dummy = head;
        ListNode prev = nxt;

        while(head.next != null && nxt.next != null) {
            head.next = head.next.next;
            head = head.next;
            nxt.next = head.next;
            nxt = nxt.next;
        }

        head.next = prev;

        return dummy;
    }
}
