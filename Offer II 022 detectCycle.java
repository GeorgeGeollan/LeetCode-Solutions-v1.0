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
        HashSet<ListNode> set = new HashSet<>();

        while(head != null) {
            if(set.contains(head))
                return head;

            set.add(head);
            head = head.next;
        }

        return null;
    }
}

public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(true) {
            if(fast == null || fast.next == null)
                return null;

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        fast = head;

        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
