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
class Solution1 {
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        int res = 0, i = 0;
        
        ListNode cur = head;
        while(cur != null) {
            i++;
            int rand = new Random().nextInt(i) + 1;
            
            if(rand == 1)
                res = cur.val;
            
            cur = cur.next;
        }
        
        return res;
    }
}

class Solution2 {
    ListNode head;
    Random random = new Random(20220116);
    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        ListNode cur = head;
        int idx = 0, ans = 0;

        while(cur != null && ++idx >= 0) {
            if(random.nextInt(idx) == 0)
                ans = cur.val;

            cur = cur.next;
        }

        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
