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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        ListNode n = new ListNode();
        ListNode ptr = n;

        while(l1 != null && l2 != null)
        {
            int num1 = l1.val;
            int num2 = l2.val;

            int sum = (num1 + num2 + count) % 10;
            n.next = new ListNode(sum);
            count = (num1 + num2 + count) / 10;
            l1 = l1.next;
            l2 = l2.next;
            n = n.next;
        }

        while(l1 != null)
        {
            int sum = (l1.val + count) % 10;
            n.next = new ListNode(sum);
            count = (l1.val + count) / 10;
            l1 = l1.next;
            n = n.next;
        }

        while(l2 != null)
        {
            int sum = (l2.val + count) % 10;
            n.next = new ListNode(sum);
            count = (l2.val + count) / 10;
            l2 = l2.next;
            n = n.next;
        }

        if(count == 1)
            n.next = new ListNode(count);

        return ptr.next;
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int impr = 0;
        int value = 0;
        
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                value = (l1.val + l2.val + impr) % 10;
                impr = (l1.val + l2.val + impr)  / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            
            else if(l1 == null) {
                value = (l2.val + impr) % 10;
                impr = (l2.val + impr) / 10;
                l2 = l2.next;
            }
            
            else if(l2 == null) {
                value = (l1.val + impr) % 10;
                impr = (l1.val + impr) / 10;
                l1 = l1.next;
            }
            
            ans.next = new ListNode(value);
            ans = ans.next;
        }
        
        if(impr == 1)
            ans.next = new ListNode(impr);
        
        return dummy.next;
    }
}

class Solution3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int impr = 0;
        int value = 0;
        
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            
            int sum = x + y + impr;
            impr = sum / 10;
            sum = sum % 10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            
            if(l1 != null)
                l1 = l1.next;
            
            if(l2 != null)
                l2 = l2.next;
        }
        
        if(impr == 1)
            ans.next = new ListNode(1);
        
        return dummy.next;
    }
}
