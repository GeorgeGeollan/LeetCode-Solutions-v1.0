/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(!set.contains(head)) {
            set.add(head);
            
            if(head == null) {
                return null;
            }
            head = head.next;
            
            
        }

        return head;
    }
}
