class Solution1 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(!stack1.isEmpty()) {
                if(s.charAt(i) == '#')
                    stack1.pop();
                
                else
                    stack1.push(s.charAt(i));

            }

            else if(s.charAt(i) != '#')
                stack1.push(s.charAt(i));
                
        }

        for(int i = 0; i < t.length(); i++) {
            if(!stack2.isEmpty()) {
                if(t.charAt(i) == '#')
                    stack2.pop();

                else
                    stack2.push(t.charAt(i));

            }

            else if(t.charAt(i) != '#')
                stack2.push(t.charAt(i));
        }

        
        if(stack1.size() != stack2.size())
            return false;

        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            if(stack1.pop() != stack2.pop())
                return false;
        }

        return stack1.size() == stack2.size();
    }
}

class Solution2 {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String w) {
        StringBuilder sb = new StringBuilder();
        char[] words = w.toCharArray();
        int size = 0;

        for(int i = words.length - 1; i >= 0; i--) {
            if(words[i] == '#')
                size++;

            else if(size == 0)
                sb.append(words[i]);

            else
                size--;
        }

        return sb.toString();
    }
}
