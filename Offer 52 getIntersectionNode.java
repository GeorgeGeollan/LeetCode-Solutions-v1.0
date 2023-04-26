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
class Solution1 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA = headA, tmpB = headB;

        if(headA != null && headB == null) {
            return null;
        }

        if(headA == null && headB != null) {
            return null;
        }

        while(tmpA != null || tmpB != null) {
            if(tmpA == null) {
                tmpA = headB;
            }

            if(tmpB == null) {
                tmpB = headA;
            }

            if(tmpA == tmpB) {
                return tmpA;
            }

            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }

        return null;
    }
}

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
class Solution2 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;

        while(A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }

        return A;
    }
}
