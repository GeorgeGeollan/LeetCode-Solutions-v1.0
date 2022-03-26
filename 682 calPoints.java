class Solution1 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int prev = 0;

        for(int i = 0; i < ops.length; i++) {
            if(ops[i].equals("C")) {
                 stack.pop();
                 
                 if(!stack.isEmpty()) {
                     int temp = stack.pop();
                     if(!stack.isEmpty())
                        prev = stack.peek();

                    stack.push(temp);
                 }
                    

                else
                    prev = 0;
            }
               

            else if(ops[i].equals("D")) {
                int top = Integer.valueOf(stack.peek());
                prev = top;
                stack.push(top * 2);
                // System.out.println(stack);
            }

            else if(ops[i].equals("+")) {
                int temp = Integer.valueOf(stack.peek());
                stack.push(stack.peek() + prev);
                prev = temp;
            }

            else {
                if(!stack.isEmpty())
                    prev = stack.peek();
                stack.push(Integer.valueOf(ops[i]));
            }
        }

        int ans = 0;
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}

class Solution2 {
    static int[] nums = new int[1010];
    public int calPoints(String[] ops) {
        int n = ops.length, idx = 0;

        for(int i = 0; i < n; i++, idx++) {
            if(ops[i].equals("+"))
                nums[idx] = nums[idx - 1] + nums[idx - 2];
            
            else if(ops[i].equals("D"))
                nums[idx] = nums[idx - 1] * 2;

            else if(ops[i].equals("C"))
                idx -= 2;
            
            else
                nums[idx] = Integer.parseInt(ops[i]);
        }

        int ans = 0;

        for(int i = 0; i < idx; i++) {
            ans += nums[i];
        }

        return ans;
    }
}
