class Solution1 {
    public int arrayNesting(int[] nums) {
        int count = 0, res = 0;
        boolean[] visited = new boolean[nums.length];

        for(int num: nums)
        {
            count = 0;
            
            while(!visited[num])
            {
                count++;
                visited[num] = true;
                num = nums[num];
            }

            res = Math.max(count, res);
        }

        return res;
    }
}

class Solution2 {
    public int arrayNesting(int[] nums) {
        int n = nums.length, ans = 0;

        for(int i = 0; i < n; i++) {
            int cur = i;
            int cnt = 0;

            while(nums[cur] != -1) {
                cnt++;
                int c = cur;
                cur = nums[cur];
                nums[c] = -1;
            }

            ans = Math.max(cnt , ans);
        }

        return ans;
    }
}
