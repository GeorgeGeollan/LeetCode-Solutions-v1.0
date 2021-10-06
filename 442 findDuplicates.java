class Solution1 {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num: nums)
        {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            
            
            if(count == 2)
                list.add(num);
        }
        
        return list;
    }
}

class Solution2 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int n = Math.abs(nums[i]);
            
            if(nums[n - 1] < 0)
                list.add(n);
            
            else
                nums[n - 1] *= -1;
        }
        
        return list;
    }
}
