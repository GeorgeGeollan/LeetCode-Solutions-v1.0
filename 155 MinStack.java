class MinStack1 {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int val) {
        if(min >= val) {
            stack.push(min);
            min = val;
        }

        stack.push(val);
    }
    
    public void pop() {
        if(stack.pop() == min)
            min = stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

class MinStack2 {
    Stack<Integer> stack_norm;
    Stack<Integer> stack_min;
    int min;

    public MinStack() {
        stack_min = new Stack();
        stack_norm = new Stack();
    }
    
    public void push(int val) {
        stack_norm.push(val);

        if(stack_min.isEmpty() || val <= stack_min.peek())
            stack_min.push(val);
            
    }
    
    public void pop() {
        if(stack_norm.pop().equals(stack_min.peek()))
            stack_min.pop();
    }
    
    public int top() {
        return stack_norm.peek();
    }
    
    public int getMin() {
        return stack_min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
