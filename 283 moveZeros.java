class Solution1 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

class Solution2 {
    public void moveZeroes(int[] nums) {
        int n = nums.length, l = 0, r = 0;

        while(r < n) {
            if(nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }

            r++;
        }
    }
}
