class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for(int i = 0; i < n; i++) {
            int a = nums[i] + diff;
            int b = nums[i] + 2 * diff;
            
            if(a >= nums[n - 1] || b > nums[n - 1])
                break;

            if(set.contains(a) && set.contains(b)) {
                cnt++;
            }
        }

        return cnt;
    }
}
