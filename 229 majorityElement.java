class Solution1 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int limit = (int)(n / 3) + 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int num : nums) {
            count = map.getOrDefault(num, 0);
            count = count + 1;
            map.put(num, count);

            if(count >= limit)
                set.add(num);
        }

        return new ArrayList<>(set);
    }
}

class Solution2 {
    public List<Integer> majorityElement(int[] nums) {
        int n1 = 0, n2 = 0;
        int c1 = 0, c2 = 0;
        List<Integer> list = new ArrayList<>();

        for(int num: nums) {
            if(c1 != 0 && n1 == num)
                c1++;
            
            else if(c2 != 0 && n2 == num)
                c2++;

            else if(c1 == 0 && ++c1 >= 0)
                n1 = num;

            else if(c2 == 0 && ++c2 >= 0)
                n2 = num;

            else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for(int num: nums) {
            if(num == n1)
                c1++;
            else if(num == n2)
                c2++;
        }

        if(c1 > nums.length / 3)
            list.add(n1);

        if(c2 > nums.length / 3)
            list.add(n2);

        return list;
    }
}
