class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        int min = list1.length + list2.length;

        for(int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for(int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int cur = map.get(list2[i]) + i;
                if(min == cur)
                    stack.push(list2[i]);

                else if(min > cur) {
                    stack = new Stack();
                    stack.push(list2[i]);
                    min = cur;
                }
            }
        }

        int n = stack.size();
        String[] ans = new String[n];
        int ptr = 0;

        while(!stack.isEmpty()) {
            ans[ptr++] = stack.pop();
        }

        return ans;
    }
}
