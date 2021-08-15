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
    public void reorderList(ListNode head) {
          if(head == null || head.next == null)
            return;

        ListNode p1 = head;
        ListNode p2 = head;

        while(p2.next != null && p2.next.next != null)
        {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode pre = p1;
        ListNode curr = p1.next;

        while(curr.next != null)
        {
            ListNode nxt = curr.next;
            curr.next = nxt.next;
            nxt.next = pre.next;
            pre.next = nxt;
        }

        p1 = head;
        p2 = pre.next;

        while(p1 != pre)
        {
            pre.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = pre.next;
        }

    }
}
