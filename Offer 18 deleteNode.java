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
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;
        while(head != null && head.val != val)
        {
            head = head.next;
            prev = prev.next;
        }

        if(head != null)
        {
            ListNode next = head.next;
            prev.next = next;
        }

        return dummy.next; 
    }
}
