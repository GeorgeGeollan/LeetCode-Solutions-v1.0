class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        
        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(nums[mid] > target)
                r = mid - 1;

            if(nums[mid] < target)
                l = mid + 1;
            
            if(nums[mid] == target)
                return mid;
        }

        return l;
    }
}

class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int l = 0, r = n - 1, ans = n;

        while(l <= r) {
            int mid = ((r - l) >> 1) + l;

            if(target <= nums[mid]) {
                ans = mid;
                r = mid - 1;
            }

            else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
