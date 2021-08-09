class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);

        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> per, int[] nums, boolean[] used)
    {
        if(per.size() == nums.length)
            list.add(new ArrayList<>(per));

        else
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                    continue;
                    
                per.add(nums[i]);
                used[i] = true;
                backtrack(list, per, nums, used);
                used[i] = false;
                per.remove(per.size() - 1);
            }
        }
    }
}
