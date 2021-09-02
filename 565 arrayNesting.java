class Solution {
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
