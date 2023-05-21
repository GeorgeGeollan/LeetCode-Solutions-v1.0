class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1;
        // Arrays.sort(nums);
        int target = nums[0];

        for(int i = 1; i < nums.length; i++) {
            System.out.println(target);
            if(target == nums[i]) {
                cnt++;
            }

            else if(cnt > 0 && target != nums[i]) {
                cnt--;
            }

            else {
                target = nums[i];
            }
        }

        return target;
    }
}
