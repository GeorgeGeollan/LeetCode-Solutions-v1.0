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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();

        while(head != null) {
            ans.add(head.val);
            head = head.next;
        }

        int n = ans.size();

        int mid = n / 2;

        for(int i = 0; i < n; i++) {
            if(ans.get(i) != ans.get(n - i - 1))
                return false;
        }


        return true;
    }
}
