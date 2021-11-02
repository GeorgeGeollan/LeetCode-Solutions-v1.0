/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public void deleteNode(ListNode node) {
        ListNode nxt = node.next;
        ListNode prev = node;

        while(nxt != null) {
            node.val = nxt.val;
            prev = node;
            node = node.next;
            nxt = nxt.next;
        }

        prev.next = null;
    }
}

class Solution2 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
