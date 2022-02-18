class Solution {
    public String removeKdigits(String num, int k) {
       Deque<Character> deque = new ArrayDeque<>();
        
        char[] ch = num.toCharArray();
        
        deque.addLast(ch[0]);
        
        for(int i = 1; i < ch.length; i++) {
            while(!deque.isEmpty() && k > 0 && deque.peekLast() > ch[i]) {
                deque.pollLast();
                k--;
            }
            
            
            deque.addLast(ch[i]);
            
            
        }
        
        while(!deque.isEmpty() && k > 0) {
            deque.pollLast();
            k--;
        }
        
        
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        
        while(!deque.isEmpty()) {
            if(isFirst && deque.peekFirst() == '0') {
                deque.pollFirst();
                continue;
            }
            
            
            
           
            isFirst = false;
            sb.append(deque.pollFirst());
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
