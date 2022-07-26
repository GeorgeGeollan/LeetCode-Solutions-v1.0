class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
                count++;

            else
            {
                max = Math.max(max, count);
                count = 0;
            }
        }

        max = Math.max(max, count);

        return max;
    }
}

class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            cnt = 0;
            while(i < nums.length && nums[i] == 1) {
                i++;
                cnt++;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}
