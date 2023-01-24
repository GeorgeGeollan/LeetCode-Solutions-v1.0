class Solution1 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            if(nums[left] <= nums[right])
                return nums[left];
            
            else if(nums[left] > nums[right])
                left++;
        }

        return -1;
    }
}

class Solution2 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left < right)
        {
            mid = left + (right - left) / 2;
            if(nums[mid] > nums[right])
                left = mid + 1;
            else if(nums[mid] <= nums[right])
                right = mid;
        }

        return nums[left];
    }
}
