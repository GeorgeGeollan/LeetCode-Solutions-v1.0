class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int n = pushed.length;
        int ptr = 0;
        stack.push(pushed[0]);

       for(int i = 1; i < n; i++) {
            while(!stack.isEmpty() && stack.peek() == popped[ptr]) {
                stack.pop();
                ptr++;
            }

            stack.push(pushed[i]);
        }
        
        while(!stack.isEmpty() && stack.peek() == popped[ptr]) {
                stack.pop();
                ptr++;
        }

        System.out.println(stack);
        return stack.isEmpty();
    }
}
