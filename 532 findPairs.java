class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> diff = new HashSet<>();

        for(int num: nums) {
            if(seen.contains(num - k))
                diff.add(num - k);

            if(seen.contains(num + k))
                diff.add(num);

            seen.add(num);
        }

        return diff.size();
    }
}
