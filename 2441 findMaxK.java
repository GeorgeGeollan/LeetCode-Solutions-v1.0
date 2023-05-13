class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] <= 0) {
                break;
            }

            if(set.contains(-nums[i])) {
                return nums[i];
            }
        }

        return -1;
    }
}
