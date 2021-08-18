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

        while(headA != null && headB != null)
        {
            if(set.contains(headA))
                return headA;
            else
                set.add(headA);
            
            if(set.contains(headB))
                return headB;
            
            else
                set.add(headB);

            headA = headA.next;
            headB = headB.next;
        }

        ListNode cur = headA == null ? headB : headA;

        while(cur != null)
        {
            if(set.contains(cur))
                return cur;
            
            else
                cur = cur.next;
        }

        return null;
    }
}

public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;

        while(A != B)
        {
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }

        return A;
    }
}
