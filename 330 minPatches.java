class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0, index = 0;
        long curr = 1;

        while(curr <= n)
        {
            if(index >= nums.length || nums[index] > curr)
            {
                count++;
                curr *= 2;
            }
            
            else
                curr += nums[index++];
        }

        return count;
    }
}
