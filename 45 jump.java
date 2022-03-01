class Solution {
    public int jump(int[] nums) {
        int curDist = 0;
        int nextDist = 0;
        int ans = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            nextDist = Math.max(nums[i] + i, nextDist);

            if(i == curDist) {
                curDist = nextDist;
                ans++;
            }
        }

        return ans;
    }
}
