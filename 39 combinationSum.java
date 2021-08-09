class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
       
        backtrack(list, new ArrayList<>(), candidates, target,  0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> comb, int[] nums, int remain, int start)
    {
        if(remain < 0)
            return;

        if(remain == 0)
            list.add(new ArrayList<>(comb));

        else
        {
            for(int i = start; i < nums.length; i++)
            {
                comb.add(nums[i]);
                backtrack(list, comb, nums, remain - nums[i], i);
                comb.remove(comb.size() - 1);
            }
        }
    }
}
