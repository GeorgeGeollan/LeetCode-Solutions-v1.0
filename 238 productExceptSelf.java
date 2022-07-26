class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int product = 1;

        output[0] = 1;

        for(int i = 1; i < nums.length; i++)
            output[i] = output[i - 1] * nums[i - 1];

        int right = 1;

        for(int i = nums.length - 1; i >= 0; i--)
        {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }
}


class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = 1;
        }

        int start = nums[0];

        for(int i = 1; i < nums.length; i++) {
            ans[i] *= start;
            start = start * nums[i];    
        }

        int end = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--) {
            ans[i] *= end;
            end *= nums[i];
        }

        return ans;
    }
}
