class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
                count++;
            
            if(nums[i] == 0)
                count--;
            
            if(map.containsKey(count))
            {
                int pre = map.get(count);
                max = Math.max(max, i - pre);
            }
            
            else
                map.put(count, i);
        }

        return max;
    }
}
