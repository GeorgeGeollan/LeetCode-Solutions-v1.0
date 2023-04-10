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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        Deque<Integer> stk = new ArrayDeque<>();
        int n = list.size();
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            while(!stk.isEmpty() && stk.peek() <= list.get(i)) {
                stk.pop();
            }

            if(!stk.isEmpty()) {
                ans[i] = stk.peek();
            }

            stk.push(list.get(i));
        }

        return ans;
    }
}
