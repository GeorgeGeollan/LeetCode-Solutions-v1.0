class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();

        for(String item: path.split("/")) {
            if(item.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else if(!item.isEmpty() && !item.equals(".")) {
                stack.push(item);
            }
        }

        String ans = "";

        for(String d: stack) {
            ans = "/" + d + ans;
        }

        return ans.isEmpty() ? "/" : ans;
    }
}
