class Solution1 {
    public int findRepeatNumber(int[] nums) {
        Set repeated = new HashSet();

        for(int num: nums)
        {
            if(!repeated.add(num))
            {
                return num;
            }
        }

        return -1;
    }
}

class Solution2 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i + 1])
                return nums[i];
        }

        return -1;
    }
}

class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int i = 0;

        while(i < nums.length)
        {
            if(nums[i] == i)
            {
                i++;
                continue;
            }

            if(nums[nums[i]] == nums[i])
                return nums[i];

            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }

        return -1;
    }
}
