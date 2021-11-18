class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            count[nums[i] - 1]++;
        }

        for(int i = 0; i < n; i++) {
            if(count[i] > 0)
                continue;

            else
                list.add(i + 1);
        }

        return list;

    }
}

class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = (nums[i] - 1) % n;
            
            nums[x] += n;
        }

        for(int i = 0; i < n; i++) {
           if(nums[i] <= n)
               list.add(i + 1);
        }

        return list;

    }
}
