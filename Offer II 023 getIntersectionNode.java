/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        while(headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }

        return null;
    }
}

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;

        while(A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }

        return A;
    }
}
