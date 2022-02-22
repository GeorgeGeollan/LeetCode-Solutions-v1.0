class Solution1 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return 1;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack.add(1);
        stack2.add(-1);

        for(int i = 1; i < n; i++) {
            int top = stack.peek();
            int top2 = stack2.peek();

            int cur = nums[i] - nums[i - 1];

            if(top * cur < 0)
                stack.add(cur);

            if(top2 * cur < 0)
                stack2.add(cur);
        }


        return Math.max(stack.size(), stack2.size());
    }
}

class Solution2 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1)
            return 1;

        int preDiff = 0;
        int curDiff = 0;
        int ans = 1;

        for(int i = 1; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];

            if((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                ans++;
                preDiff = curDiff;
            }
        }

        return ans;
    }
}
