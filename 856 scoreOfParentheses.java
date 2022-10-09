class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addLast(0);

        for(char c: s.toCharArray()) {
            if(c == '(')
                d.addLast(0);

            else {
                int cur = d.pollLast();
                d.addLast(d.pollLast() + Math.max(1, 2 * cur));
            }
        }

        return d.peekLast();
    }
}
