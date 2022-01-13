class Solution {
    public int dominantIndex(int[] nums) {
        int sum = 0, n = nums.length;
        int a = -1, b = -1, idx = -1;

        for(int i = 0; i < n; i++) {
            if(a < nums[i]) {
                b = a;
                a = nums[i];
                idx = i;
            }

            else if(b < nums[i])
                b = nums[i];
                
        }

        return a >= b * 2 ? idx : -1;
    }
}
