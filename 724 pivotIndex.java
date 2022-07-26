class Solution {
    public int pivotIndex(int[] nums) {
        int sumL = 0, sumR = Arrays.stream(nums).sum();

        for(int i = 0; i < nums.length; i++) {
            sumR = sumR - nums[i];

            if(sumR == sumL)
                return i;

            sumL += nums[i];
        }

        return -1;
    }
}
