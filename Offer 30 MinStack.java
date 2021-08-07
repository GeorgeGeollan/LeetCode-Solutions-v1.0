class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        mStack = new Stack();
    }
    
    public void push(int x) {
        stack.add(x);
        if(mStack.isEmpty() || x <= mStack.peek())
            mStack.add(x);
    }
    
    public void pop() {
        if(stack.pop().equals(mStack.peek()))
            mStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return mStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
