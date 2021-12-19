class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int num = 0;
        
        LinkedList<Integer> stack_num = new LinkedList<>();
        LinkedList<String> stack_str = new LinkedList<>();
        
        for(char ch: s.toCharArray()) {
            if(ch == '[') {
                stack_num.addLast(num);
                stack_str.addLast(res.toString());
                num = 0;
                res = new StringBuilder();
            }
            
            else if(ch == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_num = stack_num.removeLast();
                for(int i = 0; i < cur_num; i++)
                    tmp.append(res);
                
                res = new StringBuilder(stack_str.removeLast() + tmp);
            }
            
            else if(ch  >= '0' && ch <= '9')
                num = num * 10 + Integer.parseInt(ch + "");
            
            else
                res.append(ch);
        }
        
        return res.toString();
    }
}
