/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public int[] reversePrint(ListNode head) {
        if(head == null)
            return new int[]{};

        ArrayList<Integer> list = new ArrayList<>();

        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(list.size() - 1 - i);
        
        return arr;
    }
}

class Solution2 {
    public int[] reversePrint(ListNode head) {
        // Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> stack = new LinkedList<>();

        while(head != null)
        {
            stack.addLast(head.val);
            head = head.next;
        }

        int[] arr = new int[stack.size()];

        for(int i = 0; i < arr.length; i++)
            arr[i] = stack.removeLast();
            
        
        return arr;
    }
}
