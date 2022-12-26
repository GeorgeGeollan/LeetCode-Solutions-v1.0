class Solution1 {
    public boolean canJump(int[] nums) {
        int maxPosition = 0;
        int n = nums.length;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i > maxPosition)
                return false;
            
            maxPosition = Math.max(maxPosition, i + nums[i]);
            
            if(maxPosition >= n - 1)
                break;
        }
        
        return true;
    }
}

class Solution2 {
    public boolean canJump(int[] nums) {
        if(nums == null)
            return false;

        int k = 0;

        for(int i = 0; i <= k; i++) {
            int temp = i + nums[i];

            k = Math.max(k, temp);

            if(k >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
