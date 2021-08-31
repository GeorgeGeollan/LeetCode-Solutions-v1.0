class Solution1 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int pop: popped)
        {
            if(count < pushed.length && !stack.contains(pop))
            {
                while(pushed[count] != pop)
                {
                    stack.add(pushed[count++]);
                }

                stack.add(pushed[count++]);
                stack.pop();
            }
        
                
            else
            {
                // System.out.println(stack);
                if(stack.isEmpty())
                    return false;

                int push = stack.pop();
                
                if(push != pop)
                    return false;
            }
        }

        return true;
    }
}

class Solution2 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for(int num: pushed)
        {
            stack.push(num);
            
            while(!stack.isEmpty() && stack.peek() == popped[i])
            {
                stack.pop();
                i++;
            }
                
        }

        return stack.isEmpty();
    }
}
