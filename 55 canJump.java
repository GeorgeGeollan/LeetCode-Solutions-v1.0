class Solution {
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
