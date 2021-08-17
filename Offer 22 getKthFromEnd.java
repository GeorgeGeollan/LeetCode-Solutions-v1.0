/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        int i = 0;

        while(fast != null && i < k)
        {
            fast = fast.next;
            i++;
        }

        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
