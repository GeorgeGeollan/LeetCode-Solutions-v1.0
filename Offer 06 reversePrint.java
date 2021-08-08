class Solution {
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
