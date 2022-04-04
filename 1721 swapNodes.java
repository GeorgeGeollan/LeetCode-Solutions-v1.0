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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = head;
        ListNode cur = head;
        int temp = k;
        
        for(int i = 1; i < k; i++) {
            cur = cur.next;
        }
        
        
        ListNode tNode = cur;
        while(cur.next != null) {
            head = head.next;
            cur = cur.next;
        }
    
        
        temp = tNode.val;
        tNode.val = head.val;
        head.val = temp;
        
        return dummy;
    }
}
