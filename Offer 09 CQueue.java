class CQueue {
    Stack stack1;
    Stack stack2;

    public CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }
    
    public void appendTail(int value) {
        stack2.add(value);
    }
    
    public int deleteHead() {
        if(stack1.isEmpty())
        {
            if(stack2.isEmpty())
                return -1;
            
            else
            {
                while(!stack2.isEmpty())
                    stack1.add(stack2.pop());
            }
        }

        return (int)stack1.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
