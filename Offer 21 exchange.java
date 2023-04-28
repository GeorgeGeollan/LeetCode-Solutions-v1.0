class Solution1 {
    public int[] exchange(int[] nums) {
        int oddIdx = 0, evenIdx = nums.length - 1;

        while(oddIdx < evenIdx) {
            while(oddIdx < evenIdx && nums[oddIdx] % 2 == 1) {
                oddIdx++;
            }

            while(evenIdx > oddIdx && nums[evenIdx] % 2 == 0) {
                evenIdx--;
            }

            int temp = nums[oddIdx];
            nums[oddIdx] = nums[evenIdx];
            nums[evenIdx] = temp;
            oddIdx++;
            evenIdx--;
        }

        return nums;
    }
}
