class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(nums[mid] > target)
                right = mid - 1;

            else if(nums[mid] < target)
                left = mid + 1;

            else
            {
                int l = mid - 1;
                int r = mid + 1;

                while(l >= 0 && nums[l] == nums[mid])
                    l--;
                
                while(r < nums.length && nums[r] == nums[mid])
                    r++;

                return r - l - 1;

            }
        }

        return 0;
    }
}
