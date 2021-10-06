class Solution1 {
    public int thirdMax(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int min = nums[0], max = nums[nums.length - 1], prev = nums[nums.length - 1];
        int count = 1;
        for(int i = nums.length -2; i >= 0; i--)
        {
            if(prev != nums[i])
            {
                count++;
                prev = nums[i];
            }

            if(count == 3)
                return prev;
        }

        return max;
    }
}

class Solution2 {
    public int thirdMax(int[] nums) {
        long min = Long.MIN_VALUE;
        long a = min, b = min, c = min;

        for(int num: nums)
        {
            if(a < num)
            {
                c = b;
                b = a;
                a = num;
            }

            else if(b < num && a > num)
            {
                c = b;
                b = num;
            }

            else if(c < num && b > num)
                c = num;
        }

        return c == min ? (int)a : (int)c;
    }
}
