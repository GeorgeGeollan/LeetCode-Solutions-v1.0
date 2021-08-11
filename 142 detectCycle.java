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
public class Solution1 {
    public ListNode detectCycle(ListNode head) {
        Set set = new HashSet();

        while(head != null)
        {
            if(!set.add(head))
                return head;

            head = head.next;
        }

        return null;
    }
}

public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while(true)
        {
            if(fast == null || fast.next == null)
                return null;

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                break;
        }

        fast = head;

        while(fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
