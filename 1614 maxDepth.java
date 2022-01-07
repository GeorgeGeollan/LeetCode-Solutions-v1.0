class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;

        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                stack.push('(');
                int cur = stack.size();
                max = Math.max(max, cur);
            }

            else if(ch == ')')
                stack.pop();
        }

        return max;
    }
}
