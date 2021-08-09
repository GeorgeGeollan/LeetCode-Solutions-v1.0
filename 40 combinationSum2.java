class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);

        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> comb, int[] nums, int remains, int start)
    {
        if(remains < 0)
            return;
        
        if(remains == 0)
            list.add(new ArrayList<>(comb));

        else
        {
            for(int i = start; i < nums.length; i++)
            {
                if(i > start && nums[i] == nums[i - 1])
                    continue;
                
                comb.add(nums[i]);
                backtrack(list, comb, nums, remains - nums[i], i + 1);
                comb.remove(comb.size() - 1);
            }
        }
    }
}
