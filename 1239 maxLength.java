class Solution {
    public int maxLength(List<String> arr) {
        return dfs(arr, 0, 0);
    }

    public int dfs(List<String> arr, int cur, int mask)
    {
        if(arr.size() == cur)
            return Integer.bitCount(mask);

        int count = dfs(arr, cur + 1, mask);

        String s = arr.get(cur);

        for(char ch : s.toCharArray())
        {
            if((mask & (1 << ch - 'a')) != 0)
                return count;

            mask |= (1 << ch -'a');
        }

        return Math.max(count, dfs(arr, cur + 1, mask));
    }
}
