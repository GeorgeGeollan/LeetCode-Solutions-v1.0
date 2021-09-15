class Solution1 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        int left = 0;
        int ptr = 0;
        int product = 1;

        while(left < nums.length)
        {
            if(product < k && ptr < nums.length)
            {
                product *= nums[ptr];

                if(product < k)
                {
                    ptr++;
                    count++;
                }
                
            }

            else
            {
                left++;
                product = 1;
                ptr = left;
            }
        }

        return count;
    }
}

class Solution2 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0, cnt = 0;
        int product = 1;
        
        while(r < nums.length)
        {
            product *= nums[r];

            while(product >= k && l <= r)
            {
                product /= nums[l];
                l++;
            }

            cnt += r - l + 1;
            r++;
        }

        return cnt;
    }
}
