class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int p1 = 0;
        int p2 = 0;

        Stack<Integer> stack = new Stack<>();

        while(p1 < pushed.length || p2 < popped.length) {
            if(!stack.isEmpty()){
                int top = stack.peek();

                if(top == popped[p2]) {
                    p2++;
                    stack.pop();
                }

                else {
                    if(p1 >= pushed.length)
                        break;
                    stack.push(pushed[p1++]);
                }
            }

            else {
                stack.push(pushed[p1++]);
            }
        }

        return p1 == p2;
    }
}
