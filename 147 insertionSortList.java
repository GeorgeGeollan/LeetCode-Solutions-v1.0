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
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lastSorted = head;
        ListNode cur = head.next;
        
        while(cur != null) {
            if(lastSorted.val <= cur.val)
                lastSorted = lastSorted.next;
            
            else {
                ListNode prev = dummy;
                while(prev.next.val <= cur.val)
                    prev = prev.next;
                
                lastSorted.next = cur.next;
                cur.next = prev.next;
                prev.next = cur;
            }
            
            cur = lastSorted.next;
        }
        
        return dummy.next;
    }
}
