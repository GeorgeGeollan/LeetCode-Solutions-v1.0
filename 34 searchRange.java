class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        ans[0] = -1;
        ans[1] = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                ans[0] = i;
                break;
            }
        }
        
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        
        return ans;
    }
}

class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
    
        int l = 0, r = nums.length - 1;
        
        while( l < r) {
            int mid = (l + r )/2;
            if(nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        
        if( nums[r] != target) return new int[]{-1,-1}; 
        int L = r;
        
        l = 0; r = nums.length - 1;
        
        while( l < r) {
            int mid = (l + r + 1)/2;
            if(nums[mid] <= target ) l = mid;
            else r = mid - 1;
        }
        return new int[]{L,r};
    }
}
