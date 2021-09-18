class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;

        if(nums.length == 1)
            return 0;

        int[] sum = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++)
            sum[i + 1] = sum[i] + nums[i];

        
        for(int i = 0; i < nums.length; i++)
            if(sum[i] - sum[0] == sum[nums.length] - sum[i + 1])
                return i;

        return -1;
    }
}
