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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = null;
        ListNode dummy = list1;

        int cnt = 0;
        while(true) {
            if(cnt == a) {
                prev.next = list2;
            }

            if(cnt == b) {
                while(list2.next != null) {
                    list2 = list2.next;
                }

                list2.next = list1.next;
                break;
            }
            
            cnt++;
            prev = list1;
            list1 = list1.next;
        }

        return dummy;
    }
}
