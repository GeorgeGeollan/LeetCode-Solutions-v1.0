class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            int l = i + 1, r = nums.length - 1;

            if(nums[i] > 0)
                break;
            
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            while(l < r)
            {
                if(nums[l] + nums[r] + nums[i] == 0)
                {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while(l + 1 < r && nums[l] == nums[l + 1])
                        l++;

                    while(l < r && nums[r] == nums[r - 1])
                        r--;

                    l++;
                    r--;
                }
                

                if(nums[l] + nums[r] + nums[i] > 0)
                    r--;
                
                if(nums[l] + nums[r] + nums[i] < 0)
                    l++;

            }
            
        }

        return list;
    }
}
