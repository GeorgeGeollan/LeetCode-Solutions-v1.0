class Solution1 {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        
        for(int num: nums) {
            ans ^= num;
        }
        
        return ans;
    }
}

class Solution2 {
    public int singleNonDuplicate(int[] nums) {
       int n = nums.length;
       int l = 0, r = n - 1;

       while(l < r) {
           int mid = l + r >> 1;

           if(mid % 2 == 0) {
               if(mid + 1 < n && nums[mid] == nums[mid + 1]) l = mid + 1;

                else r = mid;
           }

           else {
               if(mid - 1 >= 0 && nums[mid - 1] == nums[mid]) l = mid + 1;

               else r = mid;
           }
       }

       return nums[r];
    }
}
