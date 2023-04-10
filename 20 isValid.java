class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch == '[' || ch == '(' || ch == '{') {
                stk.push(ch);
            }

            else if(!stk.isEmpty()){
                if(stk.peek() == '[' && ch == ']') {
                    stk.pop();
                }

                else if(stk.peek() == '(' && ch == ')') {
                    stk.pop();
                }

                else if(stk.peek() == '{' && ch == '}') {
                    stk.pop();
                }

                else {
                    stk.push(ch);
                }
            }

            else {
                stk.push(ch);
            }
        }

        return stk.size() == 0;
    }
}
