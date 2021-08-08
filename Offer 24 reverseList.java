/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode behind = null;
        ListNode next;

        while(head != null)
        {
            next = head.next;
            head.next = behind;
            behind = head;
            head = next;
        }

        return behind;

    }
}
