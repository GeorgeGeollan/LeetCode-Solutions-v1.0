class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 0 || s == null) {
            return "";
        }
            

        int start = 0;
        int end = 0;
        String ans = "";

        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '(')
                stack.push(ch[i]);

            else if(ch[i] == ')')
                stack.pop();

            end++;
            

            if(stack.size() == 0) {
                ans += s.substring(start + 1, end - 1);
                start = end;
            }
        }

        return ans;
    }
}
