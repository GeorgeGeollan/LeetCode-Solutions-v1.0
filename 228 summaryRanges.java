class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        ArrayList<String> ans = new ArrayList<>();

        if(n == 0)
            return ans;

        int end = 0, start = 0;

        for(int i = 1; i < n; i++) {
            if(nums[end] + 1 == nums[i]) {
                end++;
                continue;
            }

            if(end == start)
                ans.add("" + nums[start]);

            else
                ans.add("" + nums[start] + "->" + nums[end]);
            
            start = end + 1;
            end = start;
        }

        if(end == start)
            ans.add("" + nums[start]);

        else
            ans.add("" + nums[start] + "->" + nums[end]);

        return ans;
            
    }
}
