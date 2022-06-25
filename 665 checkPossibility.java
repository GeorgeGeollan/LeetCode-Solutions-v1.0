class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return true;
        
        boolean flag = nums[0] <= nums[1] ? true : false;
        
        for(int i = 1; i < n - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                if(flag) {
                    if(nums[i + 1] >= nums[i - 1])
                        nums[i] = nums[i + 1];
                    
                    else
                        nums[i + 1] = nums[i];
                    
                    flag = false;
                }
                
                else
                    return false;
            }
        }
        
        return true;
    }
}
