class Solution {
    public int partitionString(String s) {
        int ans = 1;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                ans++;
                set.clear();
            }

            set.add(s.charAt(i));
        }

        return ans;
    }
}
